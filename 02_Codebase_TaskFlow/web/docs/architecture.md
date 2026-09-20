# TaskFlow — architecture et conventions (piste HTML/CSS)

## Nature du projet

Application de suivi des demandes internes, écrite en **HTML et CSS uniquement**.
**Aucune ligne de JavaScript**, aucune bibliothèque, aucun serveur, aucune étape de
construction : on ouvre `index.html` dans un navigateur, et c'est tout.

Ce choix est délibéré : il rend la codebase lisible par un public débutant, sans
prérequis de programmation. Les participants qui veulent travailler sur du code
avec logique disposent de la **piste Java**, dans le dossier voisin.

Les dix-huit demandes affichées sont **entièrement fictives** et ont été écrites pour
la formation. Aucune donnée réelle, aucune donnée personnelle, aucune référence client.

## Les cinq pages

| Page | Rôle |
|---|---|
| `index.html` | Tableau de suivi : indicateurs et dix-huit demandes |
| `nouvelle-demande.html` | Formulaire de dépôt, statique |
| `detail.html` | Fiche d'une demande à échéance proche (DEM-2026-0112) |
| `detail-depassee.html` | Fiche d'une demande dont l'échéance est dépassée (DEM-2026-0107) |
| `about.html` | Présentation du projet et de ses fichiers |

## Ordre de chargement des feuilles de style

L'ordre compte, et il est le même sur toutes les pages :

1. `variables.css` — les jetons de design
2. `base.css` — la remise à zéro
3. `layout.css` — la mise en page
4. `components.css` — les composants
5. `legacy-styles.css` — uniquement sur les pages qui affichent l'encart hérité
6. `responsive.css` — **toujours en dernier**

## Conventions

- Classes CSS préfixées `tf-`, variantes en double tiret : `tf-btn--secondaire`.
- Toute couleur, tout espacement et tout rayon viennent de `css/variables.css`.
  **Jamais de valeur en dur ailleurs.**
- Pas de sélecteur par identifiant, pas de `!important`, pas d'imbrication au-delà
  de deux niveaux.
- Une action est un `button`, jamais un `div` cliquable.
- Tout champ de formulaire a un `label` associé par `for` et `id`.
- Un tableau a une `caption` et des en-têtes `th` avec `scope`.
- La langue est déclarée : `<html lang="fr">`.

## Date de référence

Le tableau est daté du **14 septembre 2026**. Les mentions « échéance proche » et
« échéance dépassée » sont calculées par rapport à cette date, écrite en clair dans
le HTML — il n'y a aucun calcul automatique dans ce projet.

## Ce qu'il ne faut pas faire

- Ne pas introduire de JavaScript, même « pour simplifier une interaction ».
- Ne pas introduire de dépendance externe.
- Ne pas réécrire une page entière quand un bloc suffit.

## Points volontairement imparfaits

| Fichier | Défaut volontaire | Atelier |
|---|---|---|
| `css/legacy-styles.css` | Sélecteurs par identifiant, valeurs en dur, `!important`, imbrication sur quatre niveaux, classes redondantes | Atelier 2 |
| `index.html` et `nouvelle-demande.html` | **Cinq écarts d'accessibilité**, à retrouver avec `docs/checklist-accessibilite.md` | Atelier 4 |

Ces défauts sont **intentionnels**. Ne les corrigez pas avant l'atelier concerné.
Le corrigé est chez le formateur.
