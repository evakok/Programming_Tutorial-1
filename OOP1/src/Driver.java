
public class Driver {
	
	public static void main(String[] args) {
		//todo: create at least 1 student, 1 professor and one lecture
		Student student = new Student("Adam", 5161);
		Professor professor = new Professor("Muller", "Media");
		Lecture lecture = new Lecture("Software Engineering", 4.5);
		
		student.addLecture(lecture.getLecName());
		professor.addLecture(lecture.getLecName());
		
		
		// add the lecture to the student and the professor
		
		System.out.println("Student name: " + student.getName());
		System.out.println("Student Matriculation Number: " + student.getMatrNr());
		System.out.println("Professor Name: " + professor.getName());
		System.out.println("Professor Chair: " + professor.getChair());
	}
}
