import java.util.ArrayList;


public class Professor {
	private String name;
	private String chair;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the student a name and a chair
	public  Professor(String name, String chair) {
		this.name = name;
		this.chair = chair;
	}
	//todo: write getter and setter methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getChair() {
		return chair;
	}
	
	public void  setChair(String chair) {
		this.chair = chair;
	}
	public void addLecture(String lecture){
		//todo: fill this method
		lectures.add("Software Engineering");
		lectures.add("Java Tutorial");
		System.out.println("Elements of the ArrayList of String Type: " + lectures);
	}
}
