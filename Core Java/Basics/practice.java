import java.util.Scanner;

public class practice {
	
	public static void main(String[] args)
	{
		while(true) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		System.out.println(A);
		int B[] = new int[A.length()];
		for(int i=0;i<(A.length());i++) {
		switch(A.charAt(i)) {
		
		case 'X':
			System.out.println("10");
			B[i]=10;
			break;
		case 'V':
			System.out.println("5");
			B[i]=5;
			break;
		case 'I':
			System.out.println("1");
			B[i]=1;
			break;
		case 'U':
			System.out.println("100");
			B[i]=100;
			break;
		}	
		
	}
		int sum;
		for(int j=0;j<(B.length-1);j++)
		{
			if(B[j]<B[j+1])
			{
				sum=B[j+1]-B[j];
			}
			else
			{
				sum=B[j+1]+B[j];
			}
			System.out.println(sum);
		}
		int C = scanner.nextInt();
		if(C==0)
		{
			break;
		}
		
		
	}}
	
}
