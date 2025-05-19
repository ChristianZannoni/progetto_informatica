package main;
import java.util.ArrayList;
/**
 *
 * @author andreinm
 */
public class Corso {

    private String codice, nome;
    private int durata;
   
    
    public Corso(String codice, String nome, int durata) {
        this.codice = codice;
        this.nome = nome;
        this.durata = durata;
    }
    
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
 
    @Override
    public String toString() {
        return ""+ codice + ";" + nome + ";" + durata + ";";
    }

}
