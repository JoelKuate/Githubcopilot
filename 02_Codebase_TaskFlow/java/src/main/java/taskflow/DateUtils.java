package taskflow;

import java.time.LocalDate;

/**
 * TaskFlow - dates et echeances.
 * Dependances : Config uniquement.
 */
public final class DateUtils {

    /**
     * Met une date ISO (AAAA-MM-JJ) au format francais lisible.
     * "2026-09-14" donne "14 septembre 2026".
     * Retourne une chaine vide si l'entree est vide, absente ou invalide.
     */
    public static String formatDateFr(String dateIso) {
        if (dateIso == null || dateIso.isBlank()) {
            return "";
        }
        String[] parties = dateIso.split("-");
        if (parties.length != 3) {
            return "";
        }
        int indexMois;
        try {
            indexMois = Integer.parseInt(parties[1]) - 1;
        } catch (NumberFormatException erreur) {
            return "";
        }
        if (indexMois < 0 || indexMois >= Config.MOIS_FR.length) {
            return "";
        }
        return Integer.parseInt(parties[2]) + " " + Config.MOIS_FR[indexMois] + " " + parties[0];
    }

    /**
     * Nombre de jours restants avant l'echeance.
     * Valeur positive : echeance a venir. Valeur negative : echeance depassee.
     */
    public static int joursRestants(String echeanceIso, String referenceIso) {
        if (echeanceIso == null || echeanceIso.isBlank()) {
            return 0;
        }
        LocalDate echeance = LocalDate.parse(echeanceIso);
        LocalDate reference = LocalDate.parse(
            referenceIso == null || referenceIso.isBlank() ? Config.DATE_REFERENCE : referenceIso);
        return echeance.getDayOfMonth() - reference.getDayOfMonth();
    }

    /** Surcharge utilisant la date de reference du projet. */
    public static int joursRestants(String echeanceIso) {
        return joursRestants(echeanceIso, Config.DATE_REFERENCE);
    }

    /** Une demande est ouverte tant qu'elle n'est pas cloturee. */
    public static boolean estOuverte(Demande demande) {
        return demande != null && !Config.STATUT_CLOTUREE.equals(demande.statut());
    }

    private DateUtils() {
    }
}
