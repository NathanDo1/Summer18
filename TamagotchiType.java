
public class TamagotchiType {
	
	private Animal animal;
	private String color;
	private String gender;
	
	public TamagotchiType(Animal animal, String gender, String color) {	
		this.animal =  animal;
		this.color = color;
		this.gender = gender;	
	}
	
	public Animal getAnimalType() {
		return animal;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getGender() {
		return gender;
	}
	
}
