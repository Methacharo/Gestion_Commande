public class Commande {
    private static int dernierId = 0;
    private int id;
    private String reference;
    private String date;
    private double montant;
    private EtatCommande statut;

    public Commande(String reference, String date, double montant, EtatCommande statut) {
        this.id = autoIncrement();
        this.reference = reference;
        this.date = date;
        this.montant = montant;
        this.statut = statut;
    }

    private static int autoIncrement() {
        dernierId++;
        return dernierId;
    }

    
}