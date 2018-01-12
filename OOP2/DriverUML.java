
public class DriverUML {

	public static void main(String[] args) {
		
		//pig
		Date pigday = new Date();
		Pig pig = new Pig("Pinko", pigday, true);
		
		//lion
		Date lioday = new Date();
		Lion lion = new Lion("Lolo", lioday, false);
		
		//pet
		System.out.println("My pet " + pig.name + ".");
		System.out.println("It is a " + pig.getGender() + " and born on " + pig.birthday.toString() + ".");
		pig.saySomething();
		pig.pet();
		
		//predator
		System.out.println("My predator" + lion.name + ".");
		System.out.println("It is a " + lion.getGender() + " and born on " + lion.birthday.toString() + ".");
		lion.saySomething();
		lion.warningPlate();
		
	}
}
