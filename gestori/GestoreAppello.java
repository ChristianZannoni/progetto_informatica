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
import main.Appello;

/**
 *
 * @author Anought
 */
public class GestoreAppello {
    
    private int indexloaded = 0;
    private ArrayList<Appello> arrAppelli;
    public GestoreAppello(){
        this.arrAppelli = new ArrayList<>();
    }
    public ArrayList<Appello> getAppelli(){
        return arrAppelli;
    }
    public Appello getAppello(String idAppello){
        for(int i = 0;i<arrAppelli.size();i++){
            if(arrAppelli.get(i).getIdAppello().equals(idAppello))return arrAppelli.get(i);
        }
        return null;
    }
    public void addAppello(Appello d){
        arrAppelli.add(d);
    }
     public void leggiFile(String nomefile){
        arrAppelli.clear();
        try{
            BufferedReader br = new BufferedReader(new FileReader(nomefile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                arrAppelli.add(new Appello(data[0],data[1],data[2]));
                
// do something with line…

            }
        }catch(Exception e){
            
        }
    }
    public void caricaFile(String nomeFile){
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for(int i = this.indexloaded;i<arrAppelli.size();i++){
               writer.append(arrAppelli.get(i).toString()); 
               writer.newLine();
            }
            indexloaded = arrAppelli.size();
    }
    catch(Exception e){
        //definisci 
    }
    }
   
}

