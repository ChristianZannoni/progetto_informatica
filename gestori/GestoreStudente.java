package gestori;

import java.util.ArrayList;
import main.Studente;

/**
 *
 * @author andreinm
 */
public class GestoreStudente {

    private ArrayList<Studente> arrStudente;

    public GestoreStudente() {
        this.arrStudente = new ArrayList<>();
    }
    public ArrayList<Studente>getStudenti(){
        return this.arrStudente;
    }
    public ArrayList<Studente> trovaStudentiCorso(String codiceCorso){
        ArrayList<Studente> tmp = new ArrayList<>();
        for(Studente s:arrStudente){
            if(s.getCorso().getCodice()==codiceCorso){
                tmp.add(s);
            }
        }
        return tmp;
    }
    public void addStudente(Studente s){
        arrStudente.add(s);
    }
    public void removeStudente(Studente s){
        arrStudente.remove(s);
    }
    
}
