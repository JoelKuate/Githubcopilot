# Exercices 2 — les exercices pratiques, séparés

Six exercices **indépendants**, un fichier chacun, à ouvrir dans un navigateur et à
remplir directement. Bouton **Exporter en PDF** en haut à droite de chaque fiche.

**66 tâches pratiques au total.** Chaque tâche donne la consigne, le prompt prêt à
coller, ce qu'on doit obtenir, et un espace de réponse. Aucun exercice ne demande de
lire le support pour démarrer : ils se suffisent à eux-mêmes.

## Les six exercices

| # | Fichier | Sujet | Durée | Tâches |
|---|---|---|---|---|
| 1 | `Exercice_1_Comprendre_le_programme.html` | Comprendre un programme qu'on n'a pas écrit | 40 min | 10 |
| 2 | `Exercice_2_Analyser_et_ameliorer.html` | Analyser et améliorer un programme existant | 50 min | 10 |
| 3 | `Exercice_3_Faire_evoluer_le_programme.html` | Faire évoluer le programme, sous contrôle | 50 min | 10 |
| 4 | `Exercice_4_Verifier_tester_documenter.html` | Vérifier, tester et documenter | 60 min | 12 |
| 5 | `Exercice_5_Prompt_engineering.html` | Bien demander : l'atelier du prompt | 50 min | 12 |
| 6 | `Exercice_6_Skills_et_autres_usages.html` | Skills, instructions et autres usages de Copilot | 55 min | 12 |

Les **quatre premiers** portent sur le programme lui-même — la codebase TaskFlow.
Le **cinquième** porte sur le prompt engineering. Le **sixième** sur les skills,
les instructions et tout ce que Copilot sait faire au-delà de l'éditeur.

## Deux pistes, au choix du participant

Les exercices 1 à 4 se font indifféremment sur :

- <span>**HTML/CSS**</span> — `02_Codebase_TaskFlow/web`, aucun prérequis de programmation ;
- <span>**Java**</span> — `02_Codebase_TaskFlow/java`, pour travailler sur du code avec de la logique.

Chaque tâche donne les deux variantes. **On choisit sa piste le matin et on la garde.**
Les exercices 5 et 6 valent pour les deux pistes.

## Deux prérequis

- **Exercices 1 à 4** — rien à préparer, la codebase fonctionne telle quelle.
- **Exercice 6** — renommer `02_Codebase_TaskFlow/dossier-github-a-renommer` en `.github`,
  puis recharger l'éditeur. Le `LISEZMOI.md` du dossier explique pourquoi.

## Ce qui est volontairement cassé — ne pas corriger avant l'exercice concerné

| Piste | Où | Quoi | Exercice |
|---|---|---|---|
| HTML/CSS | `css/legacy-styles.css` | 8 défauts de qualité, dont un contraste à 2,1:1 | 2 |
| HTML/CSS | `index.html`, `nouvelle-demande.html` | 5 écarts d'accessibilité | 4 |
| Java | `RapportLegacy.java` | méthode trop longue, valeurs magiques, noms opaques | 2 |
| Java | `RechercheUtils.normaliser` | ne retire pas les accents | 2 |
| Java | `DateUtils.joursRestants` | compare le jour du mois → 2 tests en échec | 4 |

## Les réponses

Elles sont dans **`03_Exercices/Cahier_Formateur_Reponses.html`** — document formateur,
à ne pas distribuer avant la fin de l'exercice concerné.

## Sous la main pendant les exercices

- `04_Guides_Reference/Fiche_100_Commandes.html` — variables, participants, commandes, raccourcis
- `02_Codebase_TaskFlow/*/docs/architecture.md` — conventions du projet
- `02_Codebase_TaskFlow/web/docs/checklist-accessibilite.md` — ce qui prouve qu'on n'a rien cassé

## La règle qui ne change jamais

Données **C2 au maximum**, jamais de donnée réelle, jamais de module critique de
sécurité, relecture humaine systématique. La codebase TaskFlow ne contient aucune
donnée réelle : c'est pour cela qu'on travaille dessus.

Sécurité et déclaration d'usage : **accompagnement-securite@transactis.fr**
