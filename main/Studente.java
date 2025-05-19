package main;

/**
 *
 * @author andreinm
 */
public class Studente {

    private String matricola, nome, cognome, codiceCorso;

    public Studente(String matricola, String nome, String cognome, String codiceCorso) {

        if (matricola.equals("")) {
            throw new IllegalArgumentException();
        }
        
        if (nome.equals("")) {
            throw new IllegalArgumentException();
        }
        
        if (cognome.equals("")) {
            throw new IllegalArgumentException();
        }
        

        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceCorso = codiceCorso;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

  

    public String getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

   
}
