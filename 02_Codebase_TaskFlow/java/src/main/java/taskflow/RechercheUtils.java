package taskflow;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * TaskFlow - recherche, filtres et priorites.
 * Dependances : Config, Demande, DateUtils.
 */
public final class RechercheUtils {

    private static final Map<String, Integer> RANG_PRIORITE = Map.of(
        "urgente", 0, "haute", 1, "normale", 2, "basse", 3);

    /**
     * Prepare une chaine pour la recherche : minuscules, espaces de bord retires.
     * "Comptabilite" et "  comptabilite  " donnent le meme resultat.
     */
    public static String normaliser(String texte) {
        if (texte == null) {
            return "";
        }
        return texte.toLowerCase().trim();
    }

    /** Rang de tri d'une priorite. Les priorites inconnues passent en dernier. */
    public static int rangPriorite(String priorite) {
        return RANG_PRIORITE.getOrDefault(normaliser(priorite), 99);
    }

    /**
     * Filtre les demandes sur un texte libre, un service et un statut.
     * Les trois criteres sont optionnels et se combinent.
     * Retourne une nouvelle liste, triee par priorite puis par echeance.
     */
    public static List<Demande> filtrerDemandes(List<Demande> demandes, String recherche,
                                                String service, String statut) {
        String terme = normaliser(recherche);
        return demandes.stream()
            .filter(d -> service == null || service.isBlank() || service.equals(d.service()))
            .filter(d -> statut == null || statut.isBlank() || statut.equals(d.statut()))
            .filter(d -> terme.isEmpty()
                || normaliser(d.objet()).contains(terme)
                || normaliser(d.ref()).contains(terme)
                || normaliser(d.service()).contains(terme)
                || normaliser(d.demandeur()).contains(terme))
            .sorted(Comparator.comparingInt((Demande d) -> rangPriorite(d.priorite()))
                .thenComparing(Demande::echeance))
            .collect(Collectors.toList());
    }

    /** Compte les demandes urgentes encore ouvertes. */
    public static long compterUrgentesOuvertes(List<Demande> demandes) {
        return demandes.stream()
            .filter(DateUtils::estOuverte)
            .filter(d -> Config.PRIORITE_URGENTE.equals(normaliser(d.priorite())))
            .count();
    }

    private RechercheUtils() {
    }
}
