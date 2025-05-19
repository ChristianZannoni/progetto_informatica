package main;

/**
 *
 * @author andreinm
 */
public class Disciplina {
    private String Codice,nome;
    private int cfu;
    private String codiceCorso;
    public Disciplina(String Codice, String nome, int cfu, String codiceCorso) {
        this.Codice = Codice;
        this.nome = nome;
        this.cfu = cfu;
        this.codiceCorso = codiceCorso;
    }

    public String getCodice() {
        return Codice;
    }

    public void setCodice(String Codice) {
        this.Codice = Codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

    public String getCodiceCorso() {
        return codiceCorso;
    }

    public void setCodiceCorso(String codiceCorso) {
        this.codiceCorso = codiceCorso;
    }

  
    
    
    
}
