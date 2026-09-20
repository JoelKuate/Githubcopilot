package taskflow;

import java.util.List;

/**
 * TaskFlow - jeu de donnees de demonstration.
 * Dix-huit demandes internes entierement fictives, ecrites pour la formation.
 * Aucune donnee reelle, aucune donnee personnelle, aucune reference client.
 *
 * Ce fichier est FIGE : ne le modifiez pas pendant les ateliers.
 */
public final class DonneesDemo {

    public static List<Demande> demandes() {
        return List.of(
            new Demande("DEM-2026-0101", "Accès au répertoire partagé Comptabilite", "Comptabilite", "normale", "en cours",   "2026-08-28", "2026-09-18", "Service Comptabilite"),
            new Demande("DEM-2026-0102", "Remplacement d'un poste de travail",        "Informatique", "basse",   "nouvelle",   "2026-09-01", "2026-09-30", "Service Informatique"),
            new Demande("DEM-2026-0103", "Mise à jour de la fiche de poste",          "RH",           "normale", "en attente", "2026-08-20", "2026-09-15", "Service RH"),
            new Demande("DEM-2026-0104", "Revue de la clause de confidentialité",     "Juridique",    "haute",   "en cours",   "2026-09-02", "2026-09-16", "Service Juridique"),
            new Demande("DEM-2026-0105", "Commande de fournitures de bureau",         "Logistique",   "basse",   "cloturee",   "2026-08-10", "2026-08-25", "Service Logistique"),
            new Demande("DEM-2026-0106", "Ouverture d'un compte de messagerie",       "Informatique", "urgente", "en cours",   "2026-09-10", "2026-09-15", "Service RH"),
            new Demande("DEM-2026-0107", "Archivage des dossiers 2024",               "Comptabilite", "normale", "en attente", "2026-07-30", "2026-09-05", "Service Comptabilite"),
            new Demande("DEM-2026-0108", "Échéance de renouvellement du bail",        "Juridique",    "haute",   "nouvelle",   "2026-09-08", "2026-09-22", "Service Logistique"),
            new Demande("DEM-2026-0109", "Formation bureautique pour trois agents",   "RH",           "basse",   "nouvelle",   "2026-09-05", "2026-10-09", "Service RH"),
            new Demande("DEM-2026-0110", "Incident sur l'imprimante du 2e étage",     "Informatique", "urgente", "en cours",   "2026-09-12", "2026-09-14", "Service Logistique"),
            new Demande("DEM-2026-0111", "Rapprochement bancaire du trimestre",       "Comptabilite", "haute",   "en cours",   "2026-09-03", "2026-10-15", "Service Comptabilite"),
            new Demande("DEM-2026-0112", "Badge d'accès pour un nouvel arrivant",     "RH",           "urgente", "nouvelle",   "2026-09-13", "2026-09-19", "Service RH"),
            new Demande("DEM-2026-0113", "Vérification des extincteurs",              "Logistique",   "normale", "en attente", "2026-08-25", "2026-09-25", "Service Logistique"),
            new Demande("DEM-2026-0114", "Mise à jour du règlement intérieur",        "Juridique",    "normale", "en cours",   "2026-08-18", "2026-09-28", "Service RH"),
            new Demande("DEM-2026-0115", "Sauvegarde du serveur de fichiers",         "Informatique", "haute",   "nouvelle",   "2026-09-11", "2026-09-17", "Service Informatique"),
            new Demande("DEM-2026-0116", "Note de frais du mois d'août",              "Comptabilite", "basse",   "cloturee",   "2026-09-01", "2026-09-10", "Service Comptabilite"),
            new Demande("DEM-2026-0117", "Aménagement de la salle de réunion",        "Logistique",   "basse",   "en attente", "2026-08-14", "2026-10-02", "Service Logistique"),
            new Demande("DEM-2026-0118", "Entretien annuel : planification (échéance annuelle)", "RH", "normale", "nouvelle",  "2026-09-09", "2026-12-27", "Service RH")
        );
    }

    private DonneesDemo() {
    }
}
