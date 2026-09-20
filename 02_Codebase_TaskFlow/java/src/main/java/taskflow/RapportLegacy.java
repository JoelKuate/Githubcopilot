package taskflow;

import java.util.List;

/**
 * TaskFlow - RAPPORT HERITE, volontairement mal ecrit.
 *
 * NOTE PEDAGOGIQUE : cette classe est la cible de l'atelier 2. Elle cumule les
 * defauts d'un code ancien : methode trop longue, concatenation de chaines en
 * boucle, valeurs magiques, noms opaques, duplication, niveaux d'abstraction
 * melanges.
 *
 * Objectif de l'atelier : la reecrire selon les conventions de
 * docs/architecture.md, SANS changer la sortie produite, caractere pour caractere.
 */
public class RapportLegacy {

    public static String construireRapport(List<Demande> l) {
        String s = "";
        s = s + "RAPPORT TASKFLOW" + "\n";
        s = s + "================" + "\n";
        s = s + "\n";
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < l.size(); i++) {
            Demande x = l.get(i);
            if (x.priorite().equals("urgente")) { a = a + 1; }
            if (x.priorite().equals("haute")) { b = b + 1; }
            if (x.priorite().equals("normale")) { c = c + 1; }
            if (x.priorite().equals("basse")) { d = d + 1; }
        }
        s = s + "Urgentes : " + a + "\n";
        s = s + "Hautes   : " + b + "\n";
        s = s + "Normales : " + c + "\n";
        s = s + "Basses   : " + d + "\n";
        s = s + "\n";
        s = s + "DETAIL" + "\n";
        s = s + "------" + "\n";
        for (int i = 0; i < l.size(); i++) {
            Demande x = l.get(i);
            String t = "";
            if (x.statut().equals("cloturee")) { t = "[X]"; } else { t = "[ ]"; }
            int j = DateUtils.joursRestants(x.echeance());
            String u = "";
            if (j < 0) { u = "depassee"; }
            if (j == 0) { u = "aujourd'hui"; }
            if (j > 0) { u = "dans " + j + " j"; }
            s = s + t + " " + x.ref() + " " + x.service() + " " + x.priorite() + " " + u + "\n";
        }
        return s;
    }
}
