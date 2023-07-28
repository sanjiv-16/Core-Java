import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String alpha = scanner.nextLine();
		System.out.println(alpha);
		for(int i=0;i<(alpha.length());i++){
		switch(alpha.charAt(i))
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(alpha.charAt(i)+" Is a Vowel");
			break;
		default:
			System.out.println(alpha.charAt(i)+" Is a Constant");
			break;
			
		
			
			
		}
		}
	}

}
