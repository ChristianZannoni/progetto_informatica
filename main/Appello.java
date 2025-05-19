/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.*;
/**
 *
 * @author andreinm
 */
public class Appello {
    private String idAppello,data,codiceDisciplina;

    public Appello(String idAppello, String data, String codiceDisciplina) {
        this.idAppello = idAppello;
        this.data = data;
        this.codiceDisciplina = codiceDisciplina;
    }

    public String getIdAppello() {
        return idAppello;
    }

    public void setIdAppello(String idAppello) {
        this.idAppello = idAppello;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCodiceDisciplina() {
        return codiceDisciplina;
    }

    public void setCodiceDisciplina(String codiceDisciplina) {
        this.codiceDisciplina = codiceDisciplina;
    }
    
    
    
}
