# TaskFlow — piste HTML / CSS

Codebase d'exercice de la formation **GitHub Copilot pour débutants — Transactis**.

**Aucune ligne de JavaScript.** Aucune installation, aucune compilation, aucun serveur :
ouvrez `index.html` dans un navigateur.

## Les cinq pages

- `index.html` — le tableau de suivi des dix-huit demandes
- `nouvelle-demande.html` — le formulaire de dépôt, statique
- `detail.html` — la fiche d'une demande à échéance proche
- `detail-depassee.html` — la fiche d'une demande dont l'échéance est dépassée
- `about.html` — la présentation du projet et de ses fichiers

## Les six feuilles de style

`variables.css` (les jetons), `base.css`, `layout.css`, `components.css`,
`responsive.css` (toujours chargé en dernier) et `legacy-styles.css`
— cette dernière est **volontairement mal écrite** : c'est la cible de l'atelier 2.

## Ce qui est volontairement imparfait

- `css/legacy-styles.css` — un CSS ancien à reprendre sans changer le rendu visuel.
- `index.html` et `nouvelle-demande.html` — **cinq écarts d'accessibilité** à retrouver
  avec `docs/checklist-accessibilite.md`, à l'atelier 4.

Ne les corrigez pas avant l'atelier concerné.

## Aucune donnée réelle

Les dix-huit demandes affichées sont fictives. Aucune donnée personnelle, aucune
référence client, aucun secret technique. La codebase respecte la section 5 du guide
de sécurité Transactis.

## Et si je veux du code avec de la logique ?

Prenez la **piste Java**, dans le dossier voisin : même application, mêmes exercices,
avec de vraies fonctions et une vraie suite de tests.
