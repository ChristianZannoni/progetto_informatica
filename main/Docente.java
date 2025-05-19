package main;

/**
 *
 * @author andreinm
 */
public class Docente {
    private String matricola,nome,cognome,codiceDisciplina;
    
    //matricolaDocente;nome;cognome;codiceDisciplina

    public Docente(String matricola, String nome, String cognome, String codiceDisciplina) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceDisciplina = codiceDisciplina;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceDisciplina() {
        return codiceDisciplina;
    }

    public void setCodiceDisciplina(String codiceDisciplina) {
        this.codiceDisciplina = codiceDisciplina;
    }

   
    
    
}
