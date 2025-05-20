package gestori;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import main.Corso;
import main.Studente;

/**
 *
 * @author andreinm
 */
public class GestoreStudente {
    private int indexloaded = 0;
    private ArrayList<Studente> arrStudente;

    public GestoreStudente() {
        this.arrStudente = new ArrayList<>();
    }
    public Studente getStudenteMatricola(String matricola){
        for(int i =0;i<arrStudente.size();i++){
          if(matricola==arrStudente.get(i).getMatricola())return arrStudente.get(i);
        }
        return null;
    }
    public ArrayList<Studente>getStudenti(){
        return this.arrStudente;
    }
    public boolean addStudente(Studente s){
        if(arrStudente.contains(s)) return false;
        if(getStudenteMatricola(s.getMatricola())== null) {
            arrStudente.add(s);
            return true;
        }
        return false;
    }
    public void removeStudente(Studente s){
        arrStudente.remove(s);
    }
       public void leggiFile(String nomefile){
        arrStudente.clear();
        try{
            BufferedReader br = new BufferedReader(new FileReader(nomefile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                arrStudente.add(new Studente(data[0],data[1],data[2],data[3]));
                
// do something with line…

            }
        }catch(Exception e){
            
        }
    }
    public void caricaFile(String nomeFile){
        indexloaded = arrStudente.size();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for(int i = this.indexloaded;i<arrStudente.size();i++){
               writer.append(arrStudente.get(i).toString()); 
               writer.newLine();
            }
            indexloaded = arrStudente.size();
    }
    catch(Exception e){
        //definisci 
    }
    }
}


