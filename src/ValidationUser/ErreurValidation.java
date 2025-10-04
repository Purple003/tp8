package ValidationUser;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Classe utilitaire pour journaliser les erreurs de validation utilisateur.
 */
public class ErreurValidation {

    private static final String LOG_FILE = "error.log";

    /**
     * Écrit un message d’erreur dans le fichier de log avec la date et l’heure.
     * @param message Message à enregistrer
     */
    public static void log(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) { // true = append
            writer.write(LocalDateTime.now() + " - " + message + System.lineSeparator());
        } catch (IOException e) {
            System.err.println(" Erreur lors de l’écriture du log : " + e.getMessage());
        }
    }
}
