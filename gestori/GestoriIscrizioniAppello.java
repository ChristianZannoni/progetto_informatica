/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestori;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import main.iscrizioneAppello;
import java.util.ArrayList;
import main.Appello;
/**
 *
 * @author Anought
 */
public class GestoriIscrizioniAppello {
    
    private int indexloaded = 0;
    private ArrayList<iscrizioneAppello> arrIscrizioni;
    public GestoriIscrizioniAppello(){
       this.arrIscrizioni = new ArrayList<>();
   }
    public ArrayList<iscrizioneAppello> getIscrizioni(){
        return arrIscrizioni;
    }
    public void addIscrizioni(iscrizioneAppello i){
        arrIscrizioni.add(i);
    }
       public void leggiFile(String nomefile){
        arrIscrizioni.clear();
        try{
            BufferedReader br = new BufferedReader(new FileReader(nomefile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                arrIscrizioni.add(new iscrizioneAppello(data[0],data[1]));
                
// do something with line…

            }
        }catch(Exception e){
            
        }
    }
    public void caricaFile(String nomeFile){
       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for(int i = this.indexloaded;i<arrIscrizioni.size();i++){
               writer.append(arrIscrizioni.get(i).toString()); 
               writer.newLine();
            }
             indexloaded = arrIscrizioni.size();
    }
    catch(Exception e){
        //definisci 
    }
    }
   
   
}
