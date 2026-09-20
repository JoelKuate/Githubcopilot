# GitHub Copilot pour débutants — Transactis

Dossier de formation complet, en un seul répertoire.
**1 journée · 09:00 → 17:45 · 30 % apports, 70 % pratique.**

Ce dossier fusionne, sans répétition, les deux supports existants :
le support Transactis V2 (150 slides) et le support « GitHub Copilot, en pratique »
(124 slides, dépôt `JoelParfaitEcoleIT/FormationGithubcopilot`).
Le détail de la fusion est en fin de page.

---

## Le principe

- **Le cours se fait en HTML/CSS**, sans une ligne de JavaScript. Aucun prérequis de programmation.
- **Les exercices se font au choix**, en HTML/CSS ou en Java, selon le participant.
  Mêmes ateliers, mêmes livrables, mêmes défauts volontaires à trouver.
- **Le guide de sécurité Transactis prévaut sur tout le reste.** En cas d'écart entre ce
  dossier et le guide, c'est le guide qui a raison.
- **Chaque affirmation cite sa source**, et le module 17 regroupe toutes les adresses.

---

## Les cinq répertoires

| Dossier | Contenu |
|---|---|
| **00_Guide_Institutionnel** | Le guide de sécurité Transactis et le programme pédagogique, dans leur version d'origine. Le support d'origine 124 slides y est également archivé. |
| **01_Support** | Le support de formation — **107 slides**, resserré à l'essentiel, un seul fichier HTML navigable, avec export PDF intégré. |
| **02_Codebase_TaskFlow** | Le terrain d'exercice, en deux pistes : `web/` (HTML/CSS seul) et `java/` (JDK seul). |
| **03_Exercices** | Le notebook participant à remplir (guide + espaces), le cahier formateur avec les réponses, les fiches d'atelier et les exercices d'autonomie. |
| **04_Guides_Reference** | La **fiche des 100 commandes**, plus les deux guides détaillés : VS Code et Copilot CLI. |

---

## Par où commencer

**Formateur** — ouvrir `01_Support/Support_GitHub_Copilot_Transactis_TaskFlow.html`
dans un navigateur. Flèches pour naviguer, **P** ou le bouton en haut à droite pour
exporter en PDF. Avant la séance : `03_Exercices/Corrige_Formateur.md` (une page de
minutage et de points de vigilance) et `03_Exercices/Cahier_Formateur_Reponses.html`
(les réponses attendues, exercice par exercice).

**Participant** — ouvrir `03_Exercices/Cahier_Participant_TaskFlow.html` : c'est le
**notebook d'exercices**, avec pour chaque atelier le guide (méthode + prompt de départ)
puis les espaces à remplir. Le remplir au fil de la journée, l'exporter en PDF à la fin.
Choisir sa piste le matin : `02_Codebase_TaskFlow/web` ou `02_Codebase_TaskFlow/java`.

**Sous la main toute la journée** — `04_Guides_Reference/Fiche_100_Commandes.html` :
les 100 commandes, variables, participants et raccourcis, chacune marquée
*pratiqué* / *référence* / *non ouvert chez Transactis*.

---

## Le support en 17 modules

| # | Module | Horaire |
|---|---|---|
| 1 | Le cadre Transactis — guide de sécurité reproduit intégralement | 09:00 |
| 2 | IA générative et Copilot : l'essentiel | 09:20 |
| 3 | Environnement Transactis et sécurité | 09:40 |
| 4 | L'interface GitHub Copilot | 10:05 |
| 5 | Cibler le contexte — variables `#`, participants `@`, commandes `/` | 10:20 |
| 6 | **Atelier 1** — Comprendre du code | 10:35 |
| 7 | Bien demander : prompt et contexte | 11:10 |
| 8 | Crédits, modèles et sobriété | 13:00 |
| 9 | **Atelier 2** — Analyser et améliorer | 13:25 |
| 10 | **Atelier 3** — Générer et modifier | 14:10 |
| 11 | **Atelier 4** — Vérifier plutôt que croire | 15:10 |
| 12 | **Atelier 5** — Documentation | 15:50 |
| 13 | **Challenge** débutant | 16:25 |
| 14 | Personnaliser Copilot — *référence* | — |
| 15 | L'écosystème GitHub Copilot — *référence* | — |
| 16 | Les bonnes pratiques officielles | 17:00 |
| 17 | Synthèse, glossaire, sources, plan des trois semaines | 17:20 |

Les modules **14 et 15** sont des sections de référence : le formateur les parcourt,
les participants les relisent seuls. Le module 15 précise en outre **ce qui n'est pas
disponible chez Transactis** — mode agent, agent distant, agents personnalisés,
délégation — et pourquoi, section du guide à l'appui.

---

## TaskFlow, le terrain d'exercice

Une application de suivi de demandes internes, avec dix-huit demandes **entièrement
fictives**. Aucune donnée réelle, aucune donnée personnelle, aucune référence client,
aucun secret technique, aucun module critique de sécurité.

### Piste HTML/CSS — `02_Codebase_TaskFlow/web`

Cinq pages, six feuilles de style, **aucune ligne de JavaScript**. On ouvre
`index.html` dans un navigateur.

Défauts volontaires : `css/legacy-styles.css` (CSS ancien à reprendre sans changer le
rendu) et **cinq écarts d'accessibilité** cachés dans `index.html` et
`nouvelle-demande.html`, à retrouver avec `docs/checklist-accessibilite.md`.
Sur un projet sans logique, **c'est la checklist qui joue le rôle de suite de tests**.

### Piste Java — `02_Codebase_TaskFlow/java`

Neuf classes, JDK seul, aucune dépendance. `./run.sh` pour exécuter, `./run.sh tests`
pour la suite de tests — **14 / 16 au démarrage, 2 en échec volontaire** sur
`joursRestants`, qui ne compare que le jour du mois.

### Personnalisation fournie

`02_Codebase_TaskFlow/dossier-github-a-renommer/` contient un exemple complet de
`copilot-instructions.md`, une instruction ciblée par `applyTo`, et une skill
`revue-taskflow` — les trois mécanismes vus au module 14, prêts à lire et à adapter.

**Une étape manuelle** : renommez ce dossier en `.github` avant de l'utiliser
(clic droit → Renommer, ou `ren dossier-github-a-renommer .github`). Il a été livré
sous ce nom parce que les dossiers commençant par un point ne peuvent pas être écrits
à distance. Le `LISEZMOI.md` qu'il contient explique comment vérifier que ça marche.

---

## Ce qui a été fusionné, et comment

| Apport | Origine | Traitement |
|---|---|---|
| Structure en 17 modules, déroulé horaire, guide de sécurité, ateliers | Support Transactis V2 | **Conservé comme ossature** |
| Fondamentaux IA (IA / ML / Deep Learning, ANI-AGI-ASI, modèle, LLM, entraînement) | Support 124 slides | Intégré au module 2 |
| Coûts : AI Credits, plans, requêtes premium, tokens entrée/sortie, 8 pratiques d'optimisation | Support 124 slides | Intégré au module 8 |
| Variables `#` complémentaires, participants `@`, commandes des autres environnements | Support 124 slides | Fusionné dans les tableaux du module 5 |
| Copilot Chat M365 vs GitHub Copilot, familles de modèles, raccourcis complets | Support 124 slides | Intégré aux modules 2, 4 et 8 |
| Instructions, `applyTo`, AGENTS.md, CLAUDE.md, prompt files, skills, réglages d'éditeur | Les deux supports | **Fusionné** au module 14, doublons supprimés |
| Agents, sous-agents, MCP, Context7, plugins, hooks, workflows, catalogues publics | Support 124 slides | Intégré au module 15 **en référence**, encadré par les slides « non disponible chez Transactis » |
| Codebase TaskBoard (HTML/CSS) et Portail Demandes (JS) | Les deux supports | **Refondues en une seule codebase TaskFlow**, en deux pistes |
| Exercices en 50 actions et en 10 étapes | Dépôt GitHub | **Refondus** en notebook participant, cahier formateur et exercices d'autonomie |
| Guides de commandes VS Code et Copilot CLI | Dépôt GitHub | Conservés tels quels, **plus une fiche de synthèse des 100 commandes** |

Aucune slide n'est reprise deux fois. Là où les deux supports traitaient le même sujet,
la version Transactis a été gardée pour le cadre et la version 124 slides pour le
détail technique sourcé. Les fonctions que le programme Transactis ne rend pas
disponibles restent présentées — jamais enseignées comme pratique.

---

## Contacts

- Formation : **hello@dhcompany.pro** — Digital House Company
- Sécurité Transactis : **accompagnement-securite@transactis.fr**

Support vérifié en **septembre 2026**. Les noms de commandes et les emplacements de
fichiers évoluent plusieurs fois par an : voir `SOURCES.md` pour les adresses à vérifier.
