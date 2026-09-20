---
name: 'Conventions CSS de TaskFlow'
description: 'Règles de style pour toutes les feuilles CSS du projet'
applyTo: '**/*.css'
---

# Conventions CSS

- Aucune couleur, aucun espacement, aucun rayon en dur : tout passe par `variables.css`.
- Pas de sélecteur par identifiant. Classes préfixées `tf-`.
- Pas de `!important`.
- Pas d'imbrication de sélecteurs au-delà de deux niveaux.
- `responsive.css` est toujours chargé en dernier.
- Toute réécriture de `legacy-styles.css` doit conserver **exactement** le même rendu visuel.
