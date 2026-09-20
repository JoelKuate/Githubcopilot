package taskflow;

import java.util.List;
import java.util.Optional;

/**
 * TaskFlow - fiche d'une demande, rendue en texte pour la console.
 * Dependances : Demande, DateUtils, RechercheUtils.
 */
public final class FicheDemande {

    /** Retourne la demande correspondant a une reference, ou un Optional vide. */
    public static Optional<Demande> trouverDemande(List<Demande> demandes, String ref) {
        if (ref == null || ref.isBlank()) {
            return Optional.empty();
        }
        String cible = RechercheUtils.normaliser(ref);
        return demandes.stream()
            .filter(d -> RechercheUtils.normaliser(d.ref()).equals(cible))
            .findFirst();
    }

    /** Construit le bloc principal de la fiche. */
    public static String blocFiche(Demande d) {
        int jours = DateUtils.joursRestants(d.echeance());
        StringBuilder bloc = new StringBuilder();
        bloc.append(d.objet()).append(System.lineSeparator());
        bloc.append(d.ref()).append(System.lineSeparator());
        bloc.append(System.lineSeparator());
        bloc.append(ligne("Service", d.service()));
        bloc.append(ligne("Demandeur", d.demandeur()));
        bloc.append(ligne("Priorite", d.priorite()));
        bloc.append(ligne("Statut", d.statut()));
        bloc.append(ligne("Depot", DateUtils.formatDateFr(d.depot())));
        bloc.append(ligne("Echeance", DateUtils.formatDateFr(d.echeance())));
        bloc.append(ligne("Jours restants", String.valueOf(jours)));
        return bloc.toString();
    }

    /** Affiche la fiche demandee, ou un message si la reference est inconnue. */
    public static String afficherDetail(List<Demande> demandes, String ref) {
        return trouverDemande(demandes, ref)
            .map(FicheDemande::blocFiche)
            .orElse("Aucune demande ne porte la reference " + (ref == null ? "(vide)" : ref) + ".");
    }

    private static String ligne(String libelle, String valeur) {
        return String.format("%-16s %s%n", libelle, valeur);
    }

    private FicheDemande() {
    }
}
