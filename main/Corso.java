package main;
import java.util.ArrayList;
/**
 *
 * @author andreinm
 */
public class Corso {

    private String codice, nome;
    private int durata;
    private Disciplina d;
    private ArrayList<Studente> arrStudenti= new ArrayList<>();
    public Corso(String codice, String nome, int durata) {
        this.codice = codice;
        this.nome = nome;
        this.durata = durata;
    }
    public void setDisciplina(Disciplina d){
        this.d = d;
        d.setCorso(this);
        
        
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
    public void addStudente(Studente s){
        arrStudenti.add(s);
        s.setCorso(this);
    }
    public void removeStudente(Studente s){
        arrStudenti.remove(s);
    }
    public ArrayList<Studente> getStudenti(){
        return arrStudenti;
    }
    
    public Studente getStudente(String matricola){
        for(Studente s:arrStudenti){
            if(s.getMatricola()==matricola){
                return s;
            }
        }
       return null;
    }
    @Override
    public String toString() {
        return ""+ codice + ";" + nome + ";" + durata + ";";
    }

}
