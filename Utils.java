import java.util.Scanner;

public class Utils {
    public static void afficherMenu() {
        System.out.println("\nMenu :");
        System.out.println("1. Enregistrer une commande");
        System.out.println("2. Lister toutes les commandes");
        System.out.println("3. Lister les commandes payées");
        System.out.println("4. Lister les commandes impayées");
        System.out.println("5. Quitter");
    }

    public static void lireChoix(GestionCommercial gestionCommercial) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            afficherMenu();
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    
                    break;
                case 2:
                    gestionCommercial.listerToutesCommandes();
                    break;
                case 3:
                    gestionCommercial.listerCommandesParStatut(EtatCommande.PAYEE);
                    break;
                case 4:
                    gestionCommercial.listerCommandesParStatut(EtatCommande.IMPAYEE);
                    break;
                case 5:
                    System.out.println("Quitter le programme.");
                    return;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }
        }
    }
}