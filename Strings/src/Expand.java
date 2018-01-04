import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int l = s.length();
		int count = 0;
		char abc;
		String new_s = "";
		
		for (int i = 0; i < l; i++) {
			abc = s.charAt(i);
			if (abc >= '0' && abc <= '9') 
				count = count * 10 + Integer.parseInt(String.valueOf(abc));
			else {
				if (count == 0) {
					new_s += abc;
				}else {
					for(int j = 0; j<count; j++) {
						new_s += abc;
					}
					count = 0;
					
				}
			}
		}
			
		System.out.println(new_s);
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  	
	}
	
}
