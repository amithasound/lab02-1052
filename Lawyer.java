
public class Lawyer extends Person {
	private String lawFirm; 
	private int yearsExperience; 
	
	
	
	public Lawyer(int age, String name, String gender, String lawFirm, int yearsExperience) {
		super(age,name,gender);
		this.lawFirm = lawFirm; 
		this.yearsExperience = yearsExperience; 
		
		
	}
	
	//@Override
	public String toString() {
		String description = super.toString();
		
		return description +  ", Esq." + " Law firm: "  + lawFirm + " , Years experience: " + yearsExperience;
		
		
		
		//return "Age: " + getAge() + " Name:  " + getName() + ", Esq." + " Law firm: "  + lawFirm + " , Years experience: " + yearsExperience;
		// has a logic error through calling the super class toString because esq is appended to the age instead of the name that could be fixed using code above
		// to fix the logic error I could make getters for age and name and override the toString but not call the super 
		
		
		
		
	}
	
	
	
	
	
}
