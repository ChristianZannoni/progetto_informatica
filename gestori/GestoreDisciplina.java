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
import main.Disciplina;
/**

 *
 * @author andreinm
 */
public class GestoreDisciplina {
private int indexloaded = 0;
    
   private ArrayList<Disciplina> arrDiscipline  ;
   public GestoreDisciplina (){
       this.arrDiscipline = new ArrayList<>();
   }
   public void addDisciplina(Disciplina d){
       arrDiscipline.add(d);
   }
   public ArrayList<Disciplina> getDiscipline(){
       return this.arrDiscipline;
   }
   public Disciplina getDisciplina(String Codice){
       for(int i = 0;i<arrDiscipline.size();i++){
           if(arrDiscipline.get(i).getCodice().equals(Codice))return arrDiscipline.get(i);
       }
       return null;
       
   }
   public void leggiFile(String nomefile){
        arrDiscipline.clear();
        try{
            BufferedReader br = new BufferedReader(new FileReader(nomefile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                arrDiscipline.add(new Disciplina(data[0],data[1],Integer.parseInt(data[2]),data[3]));
                
// do something with line…

            }
        }catch(Exception e){
            
        }
    }
    public void caricaFile(String nomeFile){
        indexloaded = arrDiscipline.size();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for(int i = this.indexloaded;i<arrDiscipline.size();i++){
               writer.append(arrDiscipline.get(i).toString()); 
               writer.newLine();
            }
    }
        catch(Exception e){
            
        }
   

 
}
}