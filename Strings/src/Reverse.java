import java.util.Scanner;

//intermediate

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev+ s.charAt(i);
		}
		System.out.println(rev);
		//todo: take an String as input and reverse it. Then print it.	
	}

}
