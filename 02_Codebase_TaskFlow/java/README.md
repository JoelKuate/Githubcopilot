# TaskFlow — piste Java

Codebase d'exercice de la formation **GitHub Copilot pour débutants — Transactis**.
Java 17 minimum, **bibliothèque standard uniquement**. Aucun Maven, aucun Gradle,
aucune dépendance.

## Démarrer

```
./run.sh                          # liste les demandes
./run.sh tests                    # lance la suite de tests
./run.sh fiche DEM-2026-0112      # affiche une fiche
./run.sh rapport                  # rapport hérité (atelier 2)
./run.sh recherche=comptabilite   # recherche libre
./run.sh service=RH statut="en cours"
```

Sous Windows : `run.bat` à la place de `./run.sh`.

## État attendu au démarrage

`./run.sh tests` affiche **14 / 16 tests réussis, 2 en échec**. Les deux échecs
portent sur `joursRestants` et sont **volontaires** : ils sont la matière de l'atelier 4.

## Les classes

| Classe | Rôle |
|---|---|
| `TaskFlowApp` | Point d'entrée console |
| `Demande` | Objet de données immuable |
| `DonneesDemo` | Jeu de dix-huit demandes fictives — **figé** |
| `Config` | Constantes partagées, dont `DATE_REFERENCE` |
| `DateUtils` | `formatDateFr`, `joursRestants`, `estOuverte` |
| `RechercheUtils` | `normaliser`, `rangPriorite`, `filtrerDemandes` |
| `FicheDemande` | `trouverDemande`, `blocFiche`, `afficherDetail` |
| `FormulaireDemande` | `validerDemande` |
| `RapportLegacy` | Code hérité volontairement mal écrit — cible de l'atelier 2 |
| `TestRunner` | La suite de tests |

## Aucune donnée réelle

Les dix-huit demandes de `DonneesDemo` sont fictives. Aucune donnée personnelle,
aucune référence client, aucun secret technique. La codebase respecte la section 5
du guide de sécurité Transactis.

## À lire avant de modifier

- `docs/architecture.md` — conventions, défauts volontaires
- `docs/checklist-qualite.md` — à repasser après chaque modification générée
