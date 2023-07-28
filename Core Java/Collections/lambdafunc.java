import java.util.*;
public class lambdafunc {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	sample ref=(c,d)-> {
		System.out.println("hello");
	   return c+d;
		};
	System.out.println(ref.add(a,b));
	}
}
interface sample{
	 int add(int a,int b);
}

	

