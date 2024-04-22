import java.util.ArrayList;

public class GestionCommercial {
    private ArrayList<Commande> commandes = new ArrayList<>();

    public void enregistrerCommande(String reference, String date, double montant, EtatCommande statut) {
        Commande nouvelleCommande = new Commande(reference, date, montant, statut);
        commandes.add(nouvelleCommande);
    }

    public void listerToutesCommandes() {
        
    }

    public void listerCommandesParStatut(EtatCommande statutRecherche) {
        
    }
}