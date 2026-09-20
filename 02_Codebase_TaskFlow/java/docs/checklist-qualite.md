# TaskFlow — checklist de relecture (piste Java)

À repasser après **toute** modification générée par un assistant, avant de l'accepter.

## Périmètre

- [ ] Seules les classes concernées ont été modifiées.
- [ ] `DonneesDemo` est resté intact.
- [ ] Aucune signature publique existante n'a changé sans raison explicite.

## Conventions

- [ ] Noms de méthodes et de variables en français, en `camelCase`.
- [ ] Aucune valeur magique : les constantes sont dans `Config`.
- [ ] Les dates passent par `java.time`, jamais par `java.util.Date`.
- [ ] Aucune sortie console dans une classe utilitaire.
- [ ] Aucune dépendance externe ajoutée.

## Robustesse

- [ ] Les entrées `null` et les chaînes vides sont traitées explicitement.
- [ ] Aucune exception n'est avalée en silence.
- [ ] Les cas limites sont couverts : liste vide, valeur absente, date manquante.

## Tests

- [ ] `./run.sh tests` compile sans avertissement bloquant.
- [ ] Les tests existants passent toujours.
- [ ] Toute correction de comportement est accompagnée d'au moins un nouveau test.

## Documentation

- [ ] Chaque méthode publique nouvelle ou modifiée a un commentaire d'en-tête :
      rôle, paramètres, valeur de retour, cas limites.
- [ ] Le commentaire dit **pourquoi**, pas seulement ce que fait le code.
