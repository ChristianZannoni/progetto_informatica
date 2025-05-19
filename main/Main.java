package main;
import gestori.*;
import Form.MainForm;
import java.util.*;
/**
 *
 * @author andreinm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainForm m = new MainForm();
        //m.setVisible(true);
        GestoreCorsi c = new GestoreCorsi();
        c.leggiFile("corsi.csv");
        ArrayList a = c.getCorsi();
        System.out.println(a);
        

    }

}
