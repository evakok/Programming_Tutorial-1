
public class Lecture {
	private String name;
	private double credits;
	
	//todo: write a constructor which already takes a name and credits
	public Lecture(String name, double credits) {
		this.name = name;
		this.credits = credits;
	}
	
	public String getLecName() {
		return name;
	}
	
	public void setLecName(String name) {
		this.name = name;
	}
	
	public Double getCredits() {
		return credits;
	}
	
	public void setCredits(Double credits) {
		this.credits = credits;
	}
	//todo: write getter and setter methods

}
