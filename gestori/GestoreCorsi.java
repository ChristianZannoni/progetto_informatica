package gestori;

import main.*;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author andreinm
 */
public class GestoreCorsi {
    private int indexloaded = 0;
    private ArrayList<Corso> arrCorsi;

    public GestoreCorsi() {
        this.arrCorsi = new ArrayList<>();
    }
    public void addCorso(Corso c){
        this.arrCorsi.add(c);
        
    }
    public void removeCorso(Corso c){
        this.arrCorsi.remove(c);
    }
    public ArrayList<Corso> getCorsi(){
        return this.arrCorsi;
    }
    //DA IMPLEMENTARE VISUALIZZA CORSI IN SEZIONE GRAFICA
    public void leggiFile(String nomefile){
        try{
            BufferedReader br = new BufferedReader(new FileReader(nomefile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                arrCorsi.add(new Corso(data[0],data[1],Integer.parseInt(data[2])));
                
// do something with line…

            }
        }catch(Exception e){
            
        }
    }
    public void caricaFile(String nomeFile){
        indexloaded = arrCorsi.size();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for(int i = this.indexloaded;i<arrCorsi.size();i++){
               writer.append(arrCorsi.get(i).toString()); 
               writer.newLine();
            }
    }
    catch(Exception e){
        //definisci 
    }
    }
}
