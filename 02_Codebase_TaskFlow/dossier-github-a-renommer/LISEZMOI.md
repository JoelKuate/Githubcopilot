# À renommer en `.github`

Ce dossier contient la **personnalisation Copilot** de TaskFlow : les trois mécanismes
vus au module 14 du support, prêts à lire et à adapter.

Pour qu'ils soient pris en compte par Copilot, **renommez ce dossier en `.github`** —
dans l'explorateur Windows, ou en ligne de commande depuis `02_Codebase_TaskFlow` :

```
ren dossier-github-a-renommer .github
```

Il a été livré sous ce nom parce que les dossiers commençant par un point ne peuvent pas
être écrits à distance sur votre machine.

## Contenu

| Fichier | Mécanisme | Module |
|---|---|---|
| `copilot-instructions.md` | Instructions de dépôt, actives automatiquement sur toutes les demandes | 14 |
| `instructions/css.instructions.md` | Instruction ciblée par `applyTo`, active uniquement sur les fichiers `.css` | 14 |
| `skills/revue-taskflow/SKILL.md` | Skill : la grille de relecture, chargée quand elle est utile ou appelée par `/` | 14 |

## Comment vérifier que ça marche

1. Renommez le dossier, rechargez la fenêtre de l'éditeur.
2. Posez une demande banale sur un fichier CSS, par exemple :
   « Ajoute une variante compacte du badge. »
3. La réponse doit **déjà** respecter les conventions du projet — classes préfixées `tf-`,
   jetons de `variables.css`, aucun JavaScript — sans que vous l'ayez demandé.
4. Appelez ensuite la skill avec `/revue-taskflow` sur la proposition obtenue.

Si rien ne change, vérifiez le réglage `chat.instructionsFilesLocations` de votre éditeur
(module 14, slide « Les réglages d'éditeur à connaître »).
