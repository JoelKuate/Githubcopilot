package taskflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TaskFlow - suite de tests, sans aucune bibliotheque.
 *
 *   java taskflow.TestRunner
 *
 * Etat attendu au demarrage de la formation : 14 / 16 reussis, 2 en echec.
 * Les deux echecs portent sur joursRestants et sont VOLONTAIRES (atelier 4).
 */
public final class TestRunner {

    private static final List<String[]> RESULTATS = new ArrayList<>();

    public static void main(String[] args) {
        lancerTests();

        long reussis = RESULTATS.stream().filter(r -> "OK".equals(r[0])).count();
        System.out.printf("%d / %d tests reussis, %d en echec.%n%n",
            reussis, RESULTATS.size(), RESULTATS.size() - reussis);

        for (String[] r : RESULTATS) {
            if ("OK".equals(r[0])) {
                System.out.printf("OK     %s%n", r[1]);
            } else {
                System.out.printf("FAIL   %-42s attendu = %-8s obtenu = %s%n", r[1], r[2], r[3]);
            }
        }

        if (reussis != RESULTATS.size()) {
            System.out.println();
            System.out.println("Des tests echouent. C'est l'etat attendu avant l'atelier 4.");
        }
    }

    static void lancerTests() {
        RESULTATS.clear();
        List<Demande> demandes = DonneesDemo.demandes();

        // --- normaliser ---
        verifier("normaliser - passe en minuscules", "comptabilite", RechercheUtils.normaliser("COMPTABILITE"));
        verifier("normaliser - retire les espaces de bord", "rh", RechercheUtils.normaliser("  RH  "));
        verifier("normaliser - valeur absente", "", RechercheUtils.normaliser(null));

        // --- formatDateFr ---
        verifier("formatDateFr - date simple", "14 septembre 2026", DateUtils.formatDateFr("2026-09-14"));
        verifier("formatDateFr - entree vide", "", DateUtils.formatDateFr(""));
        verifier("formatDateFr - mois invalide", "", DateUtils.formatDateFr("2026-13-01"));

        // --- joursRestants ---
        verifier("joursRestants - meme mois", 4, DateUtils.joursRestants("2026-09-18", "2026-09-14"));
        verifier("joursRestants - echeance du jour", 0, DateUtils.joursRestants("2026-09-14", "2026-09-14"));
        verifier("joursRestants - echeance depassee", -9, DateUtils.joursRestants("2026-09-05", "2026-09-14"));
        verifier("joursRestants - mois suivant", 31, DateUtils.joursRestants("2026-10-15", "2026-09-14"));
        verifier("joursRestants - changement d annee", 6, DateUtils.joursRestants("2027-01-02", "2026-12-27"));

        // --- estOuverte ---
        verifier("estOuverte - demande en cours", true,
            DateUtils.estOuverte(demandes.get(0)));
        verifier("estOuverte - demande cloturee", false,
            DateUtils.estOuverte(demandes.get(4)));

        // --- rangPriorite ---
        verifier("rangPriorite - urgente avant basse", true,
            RechercheUtils.rangPriorite("urgente") < RechercheUtils.rangPriorite("basse"));

        // --- filtrerDemandes ---
        verifier("filtrerDemandes - recherche par service", 4,
            RechercheUtils.filtrerDemandes(demandes, "comptabilite", "", "").size());

        // --- validerDemande ---
        verifier("validerDemande - objet trop court", 1,
            FormulaireDemande.validerDemande("abc", "RH", "normale", "2026-09-20").size());
    }

    private static void verifier(String nom, Object attendu, Object obtenu) {
        boolean ok = Objects.equals(String.valueOf(attendu), String.valueOf(obtenu));
        RESULTATS.add(new String[] { ok ? "OK" : "FAIL", nom,
            String.valueOf(attendu), String.valueOf(obtenu) });
    }

    private TestRunner() {
    }
}
