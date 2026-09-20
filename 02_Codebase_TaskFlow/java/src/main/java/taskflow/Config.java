package taskflow;

/**
 * TaskFlow - constantes partagees du projet.
 * Source unique des valeurs de reference : aucune valeur magique ailleurs.
 */
public final class Config {

    /**
     * Date de reference du jeu de donnees. Figee volontairement pour que les
     * exercices donnent le meme resultat quel que soit le jour de la formation.
     */
    public static final String DATE_REFERENCE = "2026-09-14";

    public static final String STATUT_CLOTUREE = "cloturee";
    public static final String PRIORITE_URGENTE = "urgente";

    public static final String[] MOIS_FR = {
        "janvier", "fevrier", "mars", "avril", "mai", "juin",
        "juillet", "aout", "septembre", "octobre", "novembre", "decembre"
    };

    private Config() {
        // Classe utilitaire : pas d'instance.
    }
}
