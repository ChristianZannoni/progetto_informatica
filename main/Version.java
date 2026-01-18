package main;

/**
 * Classe per gestire le informazioni sulla versione dell'applicazione
 * @author Sistema Gestione Università
 */
public class Version {
    private static final String VERSION = "1.0.0";
    private static final String APP_NAME = "Gestione Università";
    
    /**
     * Restituisce il numero di versione dell'applicazione
     * @return versione dell'applicazione
     */
    public static String getVersion() {
        return VERSION;
    }
    
    /**
     * Restituisce il nome dell'applicazione
     * @return nome dell'applicazione
     */
    public static String getAppName() {
        return APP_NAME;
    }
    
    /**
     * Restituisce il nome completo con versione
     * @return nome completo dell'applicazione con versione
     */
    public static String getFullVersion() {
        return APP_NAME + " v" + VERSION;
    }
}
