import java.util.ArrayList;


public class Student {
	private String name;
	private int matrNr;
	private ArrayList lectures = new ArrayList();
	
	
	//todo: write a constructur that already gives the student a name and a matriculation number
	public Student() {}
	
	public Student(String name, int matrNr) {
		this.name = name;
		this.matrNr = matrNr;
	}
	
	//todo: write getter and setter methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getMatrNr() {
		return matrNr;
	}
	
	public void setMatrNum(int matrNr) {
		this.matrNr = matrNr;
	}
	
	public void addLecture(String lecture){
		//todo: fill this method
		lectures.add("Software Engineering");
		lectures.add("Java Tutorial");
		System.out.println("Elements of ArrayList of String Type: " + lectures);
	}
}
