/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestori;
import java.util.ArrayList;
import main.*;
/**
 *
 * @author Anought
 */
public class Gestore {
    private GestoreAppello appello = new GestoreAppello();
    private GestoreCorsi corsi = new GestoreCorsi();
    private GestoreDisciplina discipline = new GestoreDisciplina();
    private GestoreStudente studenti = new GestoreStudente();
    private GestoreDocente docenti = new GestoreDocente();
    private GestoriIscrizioniAppello iscrizioni = new GestoriIscrizioniAppello();
    private String fileappelli  = "appelli.csv" , filecorsic = "corsi.csv" , filediscipline = "discipline.csv", filedocenti="docenti.csv", filestudente="studenti.csv", fileiscrizioni = "iscrizioni_appelli.csv";
    public Gestore(){
        salvatutto();
        
        for(Studente s:studenti.getStudenti()){
            associaStudenteCorso(s);
        }
        for(Disciplina d:discipline.getDiscipline()){
            associaDisciplinaCorso(d);     
        
        }
        for(Docente d:docenti.getDocenti()){
            associaDocenteDisciplina(d);
        } 
        for(iscrizioneAppello i : iscrizioni.getIscrizioni()){
            associaStudenteAppello(i);
        }
        for(Appello a:appello.getAppelli()){
            associaAppelloDisciplina(a);
        }
    }
    public void  leggiAppelli(){
        appello.leggiFile(fileappelli);
    }
    public void  leggiCorsi(){
        corsi.leggiFile(filecorsic);
    }
    public void  leggiDiscipline(){
        discipline.leggiFile(filediscipline);
    }
    public void  leggiDocenti(){
        docenti.leggiFile(filedocenti);
    }
    public void  leggiStudenti(){
        studenti.leggiFile(filestudente);
    }
    public void  leggiiscrizioni(){
        iscrizioni.leggiFile(fileiscrizioni);
    }
    public void salvatutto(){
        leggiAppelli();
        leggiCorsi();
        leggiDiscipline();
        leggiDocenti();
        leggiStudenti();
        leggiiscrizioni();
    }
    public void  caricaAppelli(){
        appello.caricaFile(fileappelli);
    }
    public void  caricaCorsi(){
        corsi.caricaFile(filecorsic);
    }
    public void  caricaDiscipline(){
        discipline.caricaFile(filediscipline);
    }
    public void caricaDocenti(){
        docenti.caricaFile(filedocenti);
    }
    public void  caricaStudenti(){
        studenti.caricaFile(filestudente);
    }       
    public void caricaiscrizioni(){
        iscrizioni.caricaFile(fileiscrizioni);
    }
    public void caricatutto(){
        caricaCorsi();
        caricaDiscipline();
        caricaDocenti();
        caricaStudenti();
        caricaiscrizioni();
    }
    public void associaStudenteCorso(Studente s){
       
        System.out.println(s.getCodiceCorso());
        System.out.println(corsi.getCorsoCodice(s.getCodiceCorso()).toString());
        corsi.getCorsoCodice(s.getCodiceCorso()).addStudente(s);
        
    }
    public void associaDisciplinaCorso(Disciplina d){
        Corso tmp  = corsi.getCorsoCodice(d.getCodiceCorso());
        d.setCorso(tmp);
    }
    public void associaDocenteDisciplina(Docente d){
        discipline.getDisciplina(d.getCodiceDisciplina()).setD(d);
    }
    public void associaStudenteAppello(iscrizioneAppello i){
        i.setStudente(studenti.getStudenteMatricola(i.getMatricolaStudente()));
        i.setAppello(appello.getAppello(i.getIdAppello()));
    }
    public void associaAppelloDisciplina(Appello a){
        a.setD(discipline.getDisciplina(a.getCodiceDisciplina()));
    }
    public boolean appellovalido(iscrizioneAppello i){
        System.out.println(i.getMatricolaStudente());
       if(i.getAppello()==null)return false;
       Disciplina d  = i.getAppello().getD();
       Corso c = d.getCorso();
       if(c.getStudente().contains(i.getStudente()))return true;
       return false;

        
        
        
    }
    public void addAppello(Appello a){
        associaAppelloDisciplina(a);
        appello.addAppello(a);
        
    }
    public void addCorso(Corso a){
        corsi.addCorso(a);
        
    }
    public void addDisciplina(Disciplina a){
        associaDisciplinaCorso(a);
        discipline.addDisciplina(a);
        
    }
    public void addStudente(Studente s){
        associaStudenteCorso(s);
        studenti.addStudente(s);
    }
    public void addDocente(Docente a){
        associaDocenteDisciplina(a);
        docenti.addDocente(a);
        
    }
    public void addIscrizione(iscrizioneAppello a){
        if(appellovalido(a)){
            associaStudenteAppello(a);
            iscrizioni.addIscrizioni(a);
        }
    }
    public ArrayList<Corso> getCorsi(){
        return this.corsi.getCorsi();
    }
    public ArrayList<Studente> getStudenti(){
        return studenti.getStudenti();
    }
    public ArrayList<Disciplina> getDiscipline(){
        return discipline.getDiscipline();
    }
    public ArrayList<Docente> getDocente(){
        return docenti.getDocenti();
    }
    public ArrayList<Appello> getAppelli(){
        return appello.getAppelli();
    }
    public ArrayList<iscrizioneAppello> getIscrizioni(){
        return iscrizioni.getIscrizioni();
    }
   
    public GestoreAppello getGestoreAppello() {
        return appello;
    }

    public GestoreCorsi getGestoreCorsi() {
        return corsi;
    }

    public GestoreDisciplina getGestoreDiscipline() {
        return discipline;
    }

    public GestoreStudente getGestoreStudenti() {
        return studenti;
    }

    public GestoreDocente getDocenti() {
        return docenti;
    }

    public GestoriIscrizioniAppello getGestoreIscrizioni() {
        return iscrizioni;
    }
    
    
    
    
        
}