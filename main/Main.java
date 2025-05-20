package main;

import gestori.Gestore;
import java.util.Scanner;
import main.*;
import Form.MainForm;
public class Main {
    public static void main(String[] args) {
        MainForm main = new MainForm();
        main.setVisible(true);
    }
        /*
        Gestore gestore = new Gestore();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema universitario avviato.");

        // Stampa studenti
        System.out.println("\n--- Studenti caricati ---");
        for (Studente s : gestore.getStudenti()) {
            System.out.println(s);
        }

        // Stampa corsi
        System.out.println("\n--- Corsi disponibili ---");
        for (Corso c : gestore.getCorsi()) {
            System.out.println(c);
        }

        // Stampa discipline
        System.out.println("\n--- Discipline ---");
        for (Disciplina d : gestore.getDiscipline()) {
            System.out.println(d);
        }

        // Stampa docenti
        System.out.println("\n--- Docenti ---");
        for (Docente d : gestore.getDocente()) {
            System.out.println(d);
        }

        // Stampa appelli
        System.out.println("\n--- Appelli ---");
        for (Appello a : gestore.getAppelli()) {
            System.out.println(a);
        }

        // Stampa iscrizioni e validità
        System.out.println("\n--- Iscrizioni agli appelli ---");
        for (iscrizioneAppello i : gestore.getIscrizioni()) {
            boolean valido = gestore.appellovalido(i);
            System.out.println(i + " -> Valida? " + (valido ? "Sì" : "No"));
        }

        // Esempio: aggiunta nuova iscrizione manuale (supponendo che id e matricola esistano)
        System.out.print("\nVuoi provare ad aggiungere una nuova iscrizione a un appello? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("ID appello: ");
            String idAppello = scanner.nextLine();
            System.out.print("Matricola studente: ");
            String matricola = scanner.nextLine();

            iscrizioneAppello nuovaIscrizione = new iscrizioneAppello(idAppello, matricola);
            gestore.addIscrizione(nuovaIscrizione);
            System.out.println("Iscrizione " + (gestore.appellovalido(nuovaIscrizione) ? "aggiunta" : "non valida"));
        }

        scanner.close();
    }*/
}
