import java.util.Scanner;
public class formate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter a number");
		int b=0,c=0,sum=0;
		for(int i=0;i<=a;i++)
		{
			for(int j=0;j<=i;j++) {
			if(j%2==0) {
			System.out.print("* ");
			b+=2;
			sum+=b;
			}
			else
			{
				System.out.print("# ");
				c+=2;
				sum+=c;
			}
			
			
			}
			System.out.print(sum);
			System.out.println();
		}
	}

}
