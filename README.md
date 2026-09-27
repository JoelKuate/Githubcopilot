# GitHub Copilot — Plateforme de Formation Complète

**Dépôt de formation pratique pour GitHub Copilot — de débutant à expert en 60 étapes.**

---

## 🎯 Vue d'ensemble

Ce dépôt propose une **formation complète et modulaire** sur GitHub Copilot avec :
- 📚 **Support pédagogique** — 107 slides réduites à l'essentiel
- 💻 **Terrain d'exercice TaskFlow** — HTML/CSS ou Java, aucune donnée réelle
- 🔧 **6 exercices indépendants** — 66 tâches pratiques
- ⚡ **Atelier intensif** — 60 étapes en 4h, de l'installation à la création d'agents

**Composition du code : HTML 92% | CSS 3.1% | Java 3.4% | JavaScript 1.3%**

---

## 📂 Structure du dépôt

### 1️⃣ **01_Support** — Support de formation
Fichier principal : **`Support_GitHub_Copilot_Transactis_TaskFlow.html`**

- **107 slides** navigables en HTML/CSS (aucun JavaScript)
- Export PDF intégré (bouton **P** ou lien en haut à droite)
- **17 modules** couvrant l'essentiel en 8 heures

| Module | Thème | Horaire |
|--------|-------|---------|
| 1-3 | Cadre Transactis, IA générative, sécurité | 09:00–09:40 |
| 4-5 | Interface Copilot, contexte (#, @, /) | 10:05–10:20 |
| 6-12 | 5 ateliers pratiques + challenge | 10:35–16:25 |
| 14-15 | Personnalisation et écosystème (*référence*) | — |
| 16-17 | Bonnes pratiques, sources, glossaire | 17:00–17:20 |

---

### 2️⃣ **02_Codebase_TaskFlow** — Terrain d'exercice

Application fictive de **suivi de demandes internes** — aucune donnée réelle ni module critique.

#### Piste HTML/CSS — `web/`
- **5 pages HTML** + **6 feuilles CSS** — zéro JavaScript
- Défauts volontaires à retrouver :
  - `css/legacy-styles.css` — code ancien à reprendre
  - **5 écarts d'accessibilité** dans `index.html` et `nouvelle-demande.html`
- ✅ Checklist d'accessibilité fournie : `docs/checklist-accessibilite.md`

#### Piste Java — `java/`
- **9 classes** — JDK seul, aucune dépendance
- Exécution : `./run.sh`
- Tests : `./run.sh tests` — 14/16 au démarrage, 2 en échec volontaire
- Défauts intentionnels :
  - `RapportLegacy.java` — méthode trop longue, valeurs magiques
  - `RechercheUtils.normaliser` — n'enlève pas les accents
  - `DateUtils.joursRestants` — compare mal le jour du mois

#### ⚙️ Personnalisation Copilot
Dossier `dossier-github-a-renommer/` contient un exemple complet :
- `copilot-instructions.md` — instructions globales
- `*.instructions.md` — instructions ciblées par `applyTo`
- Skill `revue-taskflow` — exemple d'automatisation

**⚠️ Étape manuelle** : renommez ce dossier en `.github` avant utilisation  
(Les dossiers commençant par `.` ne peuvent pas être écrits à distance)

---

### 3️⃣ **04_Guides_Reference** — Guides de référence

- **`Fiche_100_Commandes.html`** — Variables `#`, participants `@`, raccourcis, commandes slash
  - Chaque commande marquée : *pratiqué* / *référence* / *non disponible chez Transactis*
- **`Guide_VS_Code.html`** — Configuration VS Code pour Copilot
- **`Guide_Copilot_CLI.html`** — Utilisation de la CLI Copilot

---

### 4️⃣ **05_Exercices_2** — 6 exercices indépendants

**66 tâches pratiques au total** — chaque exercice autoporteur.

| # | Sujet | Durée | Tâches | Fichier |
|---|-------|-------|-------|---------|
| 1 | Comprendre un programme | 40 min | 10 | `Exercice_1_Comprendre_le_programme.html` |
| 2 | Analyser et améliorer | 50 min | 10 | `Exercice_2_Analyser_et_ameliorer.html` |
| 3 | Faire évoluer le programme | 50 min | 10 | `Exercice_3_Faire_evoluer_le_programme.html` |
| 4 | Vérifier, tester, documenter | 60 min | 12 | `Exercice_4_Verifier_tester_documenter.html` |
| 5 | Prompt engineering | 50 min | 12 | `Exercice_5_Prompt_engineering.html` |
| 6 | Skills et usages avancés | 55 min | 12 | `Exercice_6_Skills_et_autres_usages.html` |

- ✅ **Pistes au choix** : les exercices 1-4 se font en HTML/CSS ou Java
- 📥 **Export PDF** : bouton en haut à droite de chaque exercice
- 📋 **Réponses** : `03_Exercices/Cahier_Formateur_Reponses.html` (document formateur)

---

### 5️⃣ **2026-09-22_Exercice_Copilot_60_Etapes** — Atelier intensif

**Session complète 4h** (60 étapes, 3 niveaux) couvrant l'intégralité de Copilot.

```
codebase/          Codebase d'exercice TaskBoard (HTML/CSS/JS)
participant.html   Feuille à remplir (60 étapes, champs vides)
formateur.html     Corrigé formateur (réponses + repères de facilitation)
```

#### Déroulé des 3 niveaux

| Niveau | Étapes | Durée | Thèmes |
|--------|--------|-------|--------|
| 🟢 **Débutant** | 1–20 | ~42 min | Installation, interface, suggestions inline, Chat, variables `#`, commandes `/`, prompt de base |
| 🟡 **Intermédiaire** | 21–40 | ~91 min | Edit/Agent mode, nettoyage de code, `copilot-instructions.md`, prompt files, `AGENTS.md`, choix de modèle |
| 🔴 **Expert** | 41–60 | ~112 min | Cloud agents, agents personnalisés, sous-agents (handoffs), Skills, MCP, plugins, hooks, workflows, gouvernance |

**Durée totale** : 4h à 4h30 (+ 35 min pauses/accueil/bilan)

---

### 6️⃣ **FormationGithubcopilot-main** — Archive formateur

Dépôt source fusionné — contient la version précédente (124 slides) et les outils d'origine.

---

## 🚀 Par où commencer ?

### 👨‍🏫 Pour le **formateur**

1. **Ouvrir le support** : `01_Support/Support_GitHub_Copilot_Transactis_TaskFlow.html` dans un navigateur
   - Navigation : **Flèches**, **P** pour PDF
2. **Préparer les exercices** : 
   - Minutage et vigilance : `03_Exercices/Corrige_Formateur.md`
   - Réponses attendues : `03_Exercices/Cahier_Formateur_Reponses.html`
3. **Pendant la séance** : avoir à portée de main `04_Guides_Reference/Fiche_100_Commandes.html`

### 👨‍💻 Pour le **participant**

1. **Choisir sa piste** (le matin, ne pas changer) :
   - `02_Codebase_TaskFlow/web` (HTML/CSS, aucun prérequis)
   - `02_Codebase_TaskFlow/java` (Java, avec logique)

2. **Faire les exercices** : 
   - Ouvrir `03_Exercices/Cahier_Participant_TaskFlow.html` (notebook à remplir)
   - **OU** faire les 6 exercices indépendants dans `05_Exercices_2/`

3. **À disposition** :
   - `04_Guides_Reference/Fiche_100_Commandes.html` — 100 commandes et variables
   - `02_Codebase_TaskFlow/*/docs/architecture.md` — conventions du projet
   - `02_Codebase_TaskFlow/web/docs/checklist-accessibilite.md` — checklist a11y

4. **Exporter en PDF** : bouton en haut à droite de chaque fiche à la fin

---

## 📋 Principes fondateurs

✅ **Pas de JavaScript dans le support** — 100 % HTML/CSS  
✅ **Exercices au choix** — HTML/CSS ou Java selon le participant  
✅ **Guide de sécurité Transactis** — prévaut sur tout  
✅ **Toute affirmation citée** — module 17 regroupe les sources  
✅ **Zéro donnée réelle** — codebase TaskFlow entièrement fictive, max C2  
✅ **Ateliers auto-suffisants** — pas besoin de lire le support pour débuter  

---

## 🔧 Défauts volontaires à retrouver

| Piste | Où | Quoi | Exercice |
|-------|-----|------|----------|
| HTML/CSS | `css/legacy-styles.css` | Contraste à 2.1:1, 8 défauts de qualité | Exo 2 |
| HTML/CSS | `index.html`, `nouvelle-demande.html` | 5 écarts d'accessibilité | Exo 4 |
| Java | `RapportLegacy.java` | Méthode trop longue, valeurs magiques | Exo 2 |
| Java | `RechercheUtils.normaliser` | Ne retire pas les accents | Exo 2 |
| Java | `DateUtils.joursRestants` | Compare le jour du mois → 2 tests échoués | Exo 4 |

---

## 🔗 Fusion des supports (septembre 2026)

Ce dépôt fusionne **deux supports existants** (Transactis V2 150 slides + Formation Copilot 124 slides) en un seul dossier cohérent :

| Contenu | Origine | Traitement |
|---------|---------|-----------|
| Structure 17 modules, horaire, guide de sécurité | Transactis V2 | **Conservé** |
| Fondamentaux IA (LLM, tokens, entraînement) | 124 slides | Intégré module 2 |
| Coûts (AI Credits, optimisation) | 124 slides | Intégré module 8 |
| Instructions, skills, `applyTo`, AGENTS.md | Les deux | **Fusionné** module 14 |
| Agents, MCP, plugins, workflows | 124 slides | Module 15 (*référence*) |
| CodeBase + Exercices | Les deux | **Refondus** en TaskFlow + 6 exos |
| Guides CLI et VS Code | Dépôt GitHub | Conservés + **Fiche 100 commandes** |

**Aucune slide reprise deux fois.**

---

## 📧 Contacts

- **Formation** : hello@dhcompany.pro — Digital House Company
- **Sécurité Transactis** : accompagnement-securite@transactis.fr

---

## ✅ Vérification

Support à jour : **septembre 2026**

⚠️ *Les noms de commandes et emplacements de fichiers évoluent plusieurs fois par an.*  
👉 **Voir `SOURCES.md`** pour les adresses à revérifier régulièrement.

---

## 📊 Composition du code

| Langage | Pourcentage |
|---------|------------|
| HTML | 92 % |
| Java | 3.4 % |
| CSS | 3.1 % |
| JavaScript | 1.3 % |
| Autre | 0.2 % |

Le dépôt privilégie **HTML et CSS** (support + piste web) car aucun prérequis de programmation n'est requis. Java est proposé comme piste alternative pour les participants qui ont une expérience en développement.

---

**Prêt à commencer ? Ouvrez `01_Support/Support_GitHub_Copilot_Transactis_TaskFlow.html` 🚀**