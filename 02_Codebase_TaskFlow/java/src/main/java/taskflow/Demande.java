package taskflow;

/**
 * TaskFlow - une demande interne.
 * Objet de donnees immuable : aucun comportement metier ici.
 */
public final class Demande {

    private final String ref;
    private final String objet;
    private final String service;
    private final String priorite;
    private final String statut;
    private final String depot;
    private final String echeance;
    private final String demandeur;

    public Demande(String ref, String objet, String service, String priorite,
                   String statut, String depot, String echeance, String demandeur) {
        this.ref = ref;
        this.objet = objet;
        this.service = service;
        this.priorite = priorite;
        this.statut = statut;
        this.depot = depot;
        this.echeance = echeance;
        this.demandeur = demandeur;
    }

    public String ref()       { return ref; }
    public String objet()     { return objet; }
    public String service()   { return service; }
    public String priorite()  { return priorite; }
    public String statut()    { return statut; }
    public String depot()     { return depot; }
    public String echeance()  { return echeance; }
    public String demandeur() { return demandeur; }
}
