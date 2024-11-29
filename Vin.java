public class Vin extends Boisson{
	private String colour; 

	Vin(String name, String colour){
		super(name); 
		this.colour= colour; 
	}
	

	public String getColour(){
		return this.colour; 	
	}

	 @Override
   	 public void Afficher() {
        System.out.println("Vin " + this.getName() + " avec une belle robe " + this.getColour());
    }
	
}