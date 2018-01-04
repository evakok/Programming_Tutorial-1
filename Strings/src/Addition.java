import java.util.Scanner;

//beginner

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String i = scan.nextLine();
		int sum = 0;
		while (!i.equals("s")) {
			int j = Integer.parseInt(i);
			sum = sum + j;
			i = scan.nextLine();
		}
		System.out.println(sum);
			
		
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
		
	}
	
}
