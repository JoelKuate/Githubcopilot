package taskflow;

import java.util.ArrayList;
import java.util.List;

/**
 * TaskFlow - validation d'une demande saisie.
 * Ne persiste rien : valide et retourne la liste des erreurs.
 * Dependances : DateUtils.
 */
public final class FormulaireDemande {

    private static final int LONGUEUR_OBJET_MINIMALE = 5;

    /**
     * Valide les champs saisis. Retourne la liste des messages d'erreur,
     * vide si la saisie est correcte.
     */
    public static List<String> validerDemande(String objet, String service,
                                              String priorite, String echeance) {
        List<String> erreurs = new ArrayList<>();
        if (objet == null || objet.trim().length() < LONGUEUR_OBJET_MINIMALE) {
            erreurs.add("L'objet doit contenir au moins " + LONGUEUR_OBJET_MINIMALE + " caracteres.");
        }
        if (service == null || service.isBlank()) {
            erreurs.add("Le service est obligatoire.");
        }
        if (echeance == null || echeance.isBlank()) {
            erreurs.add("L'echeance est obligatoire.");
        } else if (DateUtils.joursRestants(echeance) < 0) {
            erreurs.add("L'echeance ne peut pas etre anterieure a la date de reference.");
        }
        if (priorite != null && !priorite.isBlank() && RechercheUtils.rangPriorite(priorite) == 99) {
            erreurs.add("Priorite inconnue : " + priorite + ".");
        }
        return erreurs;
    }

    private FormulaireDemande() {
    }
}
