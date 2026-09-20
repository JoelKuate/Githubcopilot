# TaskFlow — instructions de projet

## Nature du projet

Application de suivi de demandes internes, utilisée comme codebase d'exercice
pour la formation GitHub Copilot — Transactis. Deux pistes, au choix du participant :

- `web/` — **HTML et CSS uniquement, aucune ligne de JavaScript.** C'est la piste
  utilisée pendant le cours. Aucune bibliothèque, aucun serveur, aucun build.
- `java/` — Java avec le JDK seul, pour les participants qui veulent du code avec
  de la logique. Aucune dépendance, aucun gestionnaire de build.

## Conventions communes

- Noms et commentaires **en français**.
- Aucune valeur magique : les couleurs, espacements et seuils viennent d'une source
  unique (`web/css/variables.css`, ou les constantes de `taskflow.Config` côté Java).
- Ne jamais réécrire un fichier entier quand un bloc ou une fonction suffit.
- Ne jamais introduire de secret, d'identifiant réel ou d'adresse de serveur interne :
  ces fichiers sont versionnés et partagés.

## Piste HTML/CSS

- **Ne jamais introduire de JavaScript**, même pour « simplifier » une interaction.
- Classes CSS préfixées `tf-`, variantes en double tiret : `tf-btn--secondaire`.
- Toute couleur, espacement ou rayon vient de `css/variables.css`.
- Pas de sélecteur par identifiant, pas de `!important`, pas d'imbrication au-delà
  de deux niveaux.
- Une action est un `button`, jamais un `div` cliquable.
- Tout champ de formulaire a un `label` associé par `for` et `id`.
- Un tableau a une `caption` et des en-têtes `th` avec `scope`.
- `responsive.css` est toujours chargé en dernier.

## Piste Java

- Java 17 minimum, bibliothèque standard uniquement.
- Une classe par responsabilité ; méthodes courtes, un seul niveau d'abstraction.
- Pas de `System.out.println` dans les classes utilitaires : la sortie se fait
  dans `TaskFlowApp`.
- Les dates se manipulent avec `java.time`, jamais avec `java.util.Date`.

## Ce qu'il ne faut pas faire

- Ne pas introduire de dépendance externe.
- Ne pas modifier `java/.../DonneesDemo.java` : jeu de données figé.
- Ne pas corriger les défauts volontaires avant l'atelier concerné
  (voir le `docs/architecture.md` de chaque piste).
