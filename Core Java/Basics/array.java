import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no.of lines:");
		int N = scanner.nextInt();
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println("*");
		}
		
	}

}
