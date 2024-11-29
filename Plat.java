public class Plat{
	private String name; 
	private String description; 
	private int price; 


    Plat(String name, String description, int price){
        this.name = name; 
        this.description = description;
	this.price = price; 
    }

    Plat(String name, String description){
	this.name = name; 
        this.description = description;
    }

	
	public String getName(){
		return this.name; 
	}
	

	public int getPrice(){
		return this.price; 
	}

	public boolean hasPriceValid(){
	return this.price>0; 
	}
}

