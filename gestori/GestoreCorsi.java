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
    public Corso getCorsoCodice(String codice){
        for(Corso c : arrCorsi){
            if(codice.equals(c.getCodice()))return c; 
        }
        return null;
    }
    public boolean addCorso(Corso c){
        for(int i =0;i<arrCorsi.size();i++){
            Corso tmp = arrCorsi.get(i);
            if(tmp==c || tmp.getNome() == c.getNome()||c.getCodice() == tmp.getCodice()){
                return false;
            }
        }
       
        this.arrCorsi.add(c);
        return true;
        
    }
    public ArrayList<Corso> getCorsi(){
        return this.arrCorsi;
    }
    //DA IMPLEMENTARE VISUALIZZA CORSI IN SEZIONE GRAFICA
    public void leggiFile(String nomefile){
        arrCorsi.clear();
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
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for(int i = this.indexloaded;i<arrCorsi.size();i++){
               writer.append(arrCorsi.get(i).toString()); 
               writer.newLine();
            }
            indexloaded = arrCorsi.size();
    }
    catch(Exception e){
        //definisci 
    }
    }
    
}
