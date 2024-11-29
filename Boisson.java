public class Boisson{
	public String name; 

	public Boisson(String name){
		this.name= name; 
	}
	
	public String getName(){
		return this.name; 	
	}
	
         public void Afficher() {
                System.out.println(this.getName());
           } 


}