import java.util.ArrayList; 
import java.util.Map;
import java.util.HashMap;


public class Restaurant{
    private String name;
    private String owner;
    private int capacity;
    private ArrayList<Plat> carte = new ArrayList(); 
    private ArrayList<Boisson> carteDesBoissons = new ArrayList(); 
    private Map<Integer, String> reservationSalle = new HashMap<>();

    Restaurant(String name, String owner, int capacity){
        this.name = name; 
        this.owner = owner; 
        this.capacity = capacity; 
        Plat gratin = new Plat("Gratin", "Pommes de Terre cuites au four", 15);
        Plat raclette = new Plat("Raclette", "Fromage fondu des alpages", 10);
        this.carte.add(gratin); 
        this.carte.add(raclette); 
	Boisson coca = new Boisson("coca"); 
	Vin rosé = new Vin("rosé", "fuscia"); 
	this.carteDesBoissons.add(coca); 
	this.carteDesBoissons.add(rosé);
	for(int i=1; i<20; i++){ 
		this.reservationSalle.put(i,"Free");
	}
        
    }

    public String getName(){
        return this.name; 
    }
    public String getOwner(){
        return this.owner; 
    }
    public int getCapacity(){
        return this.capacity; 
    }
    public void Afficher(){
        System.out.println(this.name + " est ouverte"); 
        System.out.println("Elle est tenue par " + this.owner ); 
        System.out.println(this.capacity + " peuvent y manger"); 
    }
    public void AfficherCarte (){
        String carteAAfficher = new String(); 
        for (Plat platDeLaCarte : this.carte){
            carteAAfficher += platDeLaCarte.getName(); 
	    carteAAfficher += " pour "; 
	    carteAAfficher += platDeLaCarte.getPrice(); 
	    carteAAfficher += " euros \n";  
		
        }
        System.out.println("La carte du restaurant contient : ");
        System.out.println(carteAAfficher); 
    }

	public  boolean isCarteValid(){
		for (Plat platDeLaCarte : this.carte){
            		if (platDeLaCarte.hasPriceValid()==false){
				return false; 
			} 
        	}
         return true;  
	}


    public void AfficherCarteDesBoissons (){
        System.out.println("Voici la carte des boissons : ");
        for (Boisson boisson : this.carteDesBoissons){
            boisson.Afficher(); 
        }

    }
	
	public void reserverTable(int numTable){
		try{
			if(!this.reservationSalle.containsKey(numTable)){
				throw new Exception ("Cette table n'existe pas ");
			}
		} catch (Exception e) {
            		System.out.println("Il y a un souci : " + e.getMessage());
			return; 
       		 }
		this.reservationSalle.put(numTable, "Réservée");
		System.out.println("La table " + numTable + " est " + this.reservationSalle.get(numTable));  



	}

	public void AfficherTablesReservees(){
		System.out.println("les tables suivantes sont réservées : "); 
		for(int i=0; i<this.reservationSalle.size(); i++){
			if(this.reservationSalle.get(i)=="Réservée"){
				System.out.println(i); 
			}
		}

	}
	
}