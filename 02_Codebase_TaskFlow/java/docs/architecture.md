# TaskFlow — architecture et conventions (piste Java)

## Nature du projet

Application de suivi des demandes internes, en **Java avec le JDK seul**.
Aucune dépendance, aucun gestionnaire de build : `javac` puis `java`, via `run.sh`.

Les dix-huit demandes de `DonneesDemo` sont **entièrement fictives** et ont été
écrites pour la formation. Aucune donnée réelle, aucune donnée personnelle,
aucune référence client.

## Découpage

| Couche | Classes |
|---|---|
| Données | `Demande`, `DonneesDemo` |
| Utilitaires | `Config`, `DateUtils`, `RechercheUtils` |
| Présentation | `FicheDemande`, `RapportLegacy`, `TaskFlowApp` |
| Saisie | `FormulaireDemande` |
| Tests | `TestRunner` |

Règle de dépendance : les utilitaires ne connaissent pas la présentation.
**Aucun `System.out.println` dans une classe utilitaire** — la sortie se fait
dans `TaskFlowApp`.

## Conventions

- Java 17 minimum, bibliothèque standard uniquement.
- Noms de méthodes et de variables **en français**, en `camelCase` ; commentaires en français.
- Une classe par responsabilité ; méthodes courtes, un seul niveau d'abstraction.
- Les dates se manipulent avec `java.time`, jamais avec `java.util.Date`.
- Aucune valeur magique : les seuils et libellés vivent dans `Config`.
- Les classes utilitaires sont `final`, avec un constructeur privé.

## Date de référence

`Config.DATE_REFERENCE` (`2026-09-14`) fige le « aujourd'hui » du jeu de données,
pour que les exercices donnent le même résultat quel que soit le jour de la formation.

## Ce qu'il ne faut pas faire

- Ne pas introduire de dépendance externe.
- Ne pas modifier `DonneesDemo` : c'est un jeu de données figé.
- Ne pas réécrire une classe entière quand une méthode suffit.

## Points volontairement imparfaits

| Classe | Défaut volontaire | Atelier |
|---|---|---|
| `RapportLegacy` | Méthode trop longue, concaténation en boucle, valeurs magiques, noms opaques | Atelier 2 |
| `RechercheUtils.normaliser` | Ne retire pas les accents : « echeance » ne trouve pas « échéance » | Atelier 2 |
| `DateUtils.joursRestants` | Ne compare que le jour du mois : faux dès que les deux dates changent de mois | Atelier 4 |

Ces trois défauts sont **intentionnels**. Ne les corrigez pas avant l'atelier concerné.
