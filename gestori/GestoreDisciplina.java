/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestori;
import java.util.ArrayList;
import java.io.*;
import main.*;
/**
 *
 * @author andreinm
 */
public class GestoreDisciplina {
    private ArrayList<Disciplina> arrDiscipline = new ArrayList<>();
    
    
    public Disciplina getperCodice(String codice){
     arrDiscipline.forEach((n)->{
         if(n.getCodice()==codice)return n;
        
     });   
    }
     public Disciplina getperNome(String nome){
     arrDiscipline.forEach((n)->{
         if(n.getNome()==nome)return n;
        
     });   
    }
     public boolean addDisciplina(Disciplina d){
         if(getperCodice(d.getCodice())==null && getperNome(d.getNome())==null && arrDiscipline.contains(d)){
             arrDiscipline.add(d);
             return true;
         }
     }
     public void removeDisciplina(Disciplina d){
         arrDiscipline.remove(d);
     }
    
}
