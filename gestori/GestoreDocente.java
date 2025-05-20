/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestori;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import main.Corso;
import main.Docente;
/**
 *
 * @author Anought
 */
public class GestoreDocente {
    private int indexloaded = 0;
    private ArrayList<Docente> arrDocenti;
    public GestoreDocente(){
        this.arrDocenti = new ArrayList<>();
    }
    public ArrayList<Docente>getDocenti(){
        return arrDocenti;
    }
    public Docente getDocente(String Matricola){
        for(int i = 0;i<arrDocenti.size();i++){
            if(arrDocenti.get(i).getMatricola()==Matricola)return arrDocenti.get(i);
        }
        return null;
    }
    public void addDocente(Docente d){
        arrDocenti.add(d);
    }
     public void leggiFile(String nomefile){
        arrDocenti.clear();
        try{
            BufferedReader br = new BufferedReader(new FileReader(nomefile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                arrDocenti.add(new Docente(data[0],data[1],data[2],data[3]));
                
// do something with line…

            }
        }catch(Exception e){
            
        }
    }
    public void caricaFile(String nomeFile){
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for(int i = this.indexloaded;i<arrDocenti.size();i++){
               writer.append(arrDocenti.get(i).toString()); 
               writer.newLine();
            }
            indexloaded = arrDocenti.size();
    }
    catch(Exception e){
        //definisci 
    }
    }
   
}
