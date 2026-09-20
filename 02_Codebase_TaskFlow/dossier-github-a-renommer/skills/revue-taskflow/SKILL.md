---
name: revue-taskflow
description: Grille de relecture d'une modification de TaskFlow. À utiliser avant d'accepter toute proposition de code générée sur ce projet, dans la piste HTML/CSS comme dans la piste Java.
---

# Relire une modification de TaskFlow

Pour chaque proposition, vérifier dans cet ordre et répondre point par point.

1. **Périmètre** — quels fichiers sont touchés ? Un fichier non concerné a-t-il été
   modifié ? Le jeu de données Java (`DonneesDemo`) doit rester intact.
2. **Conventions** — noms en français ; piste HTML/CSS : classes préfixées `tf-`,
   aucune couleur hors `css/variables.css`, **aucun JavaScript introduit** ;
   piste Java : aucune valeur magique, `java.time` pour les dates.
3. **Accessibilité** — les actions sont-elles des `button` ? Chaque champ a-t-il son
   `label` ? Le tableau a-t-il sa `caption` et ses `th scope` ?
   Voir [la checklist](../../../web/docs/checklist-accessibilite.md).
4. **Rendu** — la modification change-t-elle l'apparence de la page, alors qu'on ne
   le demandait pas ?
5. **Cas limites** — liste vide, valeur absente, texte très long, écran étroit.

Terminer par la liste de ce que je dois vérifier moi-même dans le navigateur
(ou à l'exécution), et par ce qui, dans la proposition, sort du périmètre demandé.
