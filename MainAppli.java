public class MainAppli{
    public static void main(String[] args) {
        Restaurant laFourmiJoyeuse = new Restaurant ("La fourmi joyeuse", "Denis Ramequin", 130); 
        laFourmiJoyeuse.Afficher(); 
        laFourmiJoyeuse.AfficherCarte();
	System.out.println("est-ce que la carte est bonne ? " + laFourmiJoyeuse.isCarteValid()); 
	laFourmiJoyeuse.AfficherCarteDesBoissons(); 
	System.out.println("On teste la réservation sur la table 3 "); 
	laFourmiJoyeuse.reserverTable(3); 
	System.out.println("On teste la réservation sur la table 256 "); 
	laFourmiJoyeuse.reserverTable(256); 
	laFourmiJoyeuse.AfficherTablesReservees(); 

    }
}