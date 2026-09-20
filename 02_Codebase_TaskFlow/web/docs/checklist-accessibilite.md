# TaskFlow — checklist d'accessibilité

Cette checklist joue, sur un projet HTML/CSS, le rôle que joue une suite de tests sur
un projet avec logique : **c'est elle qui prouve qu'une modification n'a rien cassé**.

À repasser après **toute** modification générée par un assistant, avant de l'accepter.

## Structure

- [ ] La page a exactement un `h1`, et la hiérarchie des titres ne saute pas de niveau.
- [ ] Les régions principales utilisent les balises adaptées : `header`, `nav`, `main`, `footer`.
- [ ] Chaque `nav` porte un `aria-label` qui le distingue des autres.
- [ ] Le lien de la page courante porte `aria-current="page"`.
- [ ] La langue de la page est déclarée : `<html lang="fr">`.

## Formulaires

- [ ] Chaque champ a un `label` associé par `for` / `id`. **Un `placeholder` n'est pas un libellé.**
- [ ] Les libellés restent visibles quand le champ est rempli.
- [ ] Les champs liés sont regroupés dans un `fieldset` avec une `legend`.

## Interactions

- [ ] Une action est un `button`, jamais un `div` ou un `span` cliquable.
- [ ] Tout élément interactif est atteignable au clavier, dans un ordre logique.
- [ ] Le focus reste visible : ne jamais supprimer `outline` sans le remplacer.
- [ ] Le texte d'un lien décrit sa destination. **« ici », « cliquez ici », « en savoir plus » ne décrivent rien.**

## Tableaux

- [ ] Le tableau a une `caption` qui décrit son contenu.
- [ ] Les en-têtes sont des `th` avec `scope="col"` ou `scope="row"`.
- [ ] Une information n'est jamais portée par la seule couleur : le badge de priorité
      porte aussi son libellé en texte.

## Couleurs et lisibilité

- [ ] Le contraste du texte courant atteint au moins **4,5:1** sur son fond.
- [ ] Le texte reste lisible à 200 % de zoom, sans défilement horizontal.
- [ ] Toute couleur employée vient de `css/variables.css`.

## Comment s'en servir avec Copilot

Demandez-lui de **passer la page au crible de cette checklist, point par point**,
avant de lui demander la moindre correction :

```
#file index.html
Passe cette page au crible de docs/checklist-accessibilite.md, point par point.
Pour chaque point : conforme ou non, et la ligne concernée. Ne propose aucune
correction pour l'instant.
```

Vérifiez ensuite chaque écart annoncé **dans le code, vous-même**, avant de demander
la correction. Un assistant signale parfois un écart qui n'existe pas, et rate parfois
celui qui compte.
