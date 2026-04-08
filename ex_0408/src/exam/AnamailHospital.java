package exam;

public class AnamailHospital <T extends Anima> {
	private T animal;
	
	public AnamailHospital(T animal) {
		this.animal = animal;
	}
	
	public void treat() {
		animal.move();
	}
}
