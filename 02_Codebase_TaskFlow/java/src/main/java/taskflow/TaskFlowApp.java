package taskflow;

import java.util.List;

/**
 * TaskFlow - point d'entree en console.
 *
 * Usage :
 *   java taskflow.TaskFlowApp                      liste toutes les demandes
 *   java taskflow.TaskFlowApp recherche=comptabilite
 *   java taskflow.TaskFlowApp service=RH statut="en cours"
 *   java taskflow.TaskFlowApp fiche DEM-2026-0112
 *   java taskflow.TaskFlowApp rapport
 */
public final class TaskFlowApp {

    public static void main(String[] args) {
        List<Demande> demandes = DonneesDemo.demandes();

        if (args.length > 0 && "rapport".equals(args[0])) {
            System.out.print(RapportLegacy.construireRapport(demandes));
            return;
        }
        if (args.length > 1 && "fiche".equals(args[0])) {
            System.out.println(FicheDemande.afficherDetail(demandes, args[1]));
            return;
        }

        String recherche = valeur(args, "recherche");
        String service = valeur(args, "service");
        String statut = valeur(args, "statut");
        List<Demande> lignes = RechercheUtils.filtrerDemandes(demandes, recherche, service, statut);

        System.out.printf("%d demandes au total, %d ouvertes, %d urgentes ouvertes, %d affichees%n%n",
            demandes.size(),
            demandes.stream().filter(DateUtils::estOuverte).count(),
            RechercheUtils.compterUrgentesOuvertes(demandes),
            lignes.size());

        if (lignes.isEmpty()) {
            System.out.println("Aucune demande ne correspond a ces criteres.");
            return;
        }

        System.out.printf("%-16s %-52s %-14s %-9s %-11s %-22s %s%n",
            "REFERENCE", "OBJET", "SERVICE", "PRIORITE", "STATUT", "ECHEANCE", "JOURS");
        for (Demande d : lignes) {
            System.out.printf("%-16s %-52s %-14s %-9s %-11s %-22s %d%n",
                d.ref(), d.objet(), d.service(), d.priorite(), d.statut(),
                DateUtils.formatDateFr(d.echeance()), DateUtils.joursRestants(d.echeance()));
        }
    }

    /** Lit un argument de la forme cle=valeur. Retourne une chaine vide si absent. */
    private static String valeur(String[] args, String cle) {
        String prefixe = cle + "=";
        for (String arg : args) {
            if (arg.startsWith(prefixe)) {
                return arg.substring(prefixe.length());
            }
        }
        return "";
    }

    private TaskFlowApp() {
    }
}
