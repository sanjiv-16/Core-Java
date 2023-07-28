import java.util.*;
public class classsample {//first main class is run then the class is called
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=multi(a,b);
		System.out.println("the multiple is " + c);	
	}
static int multi(int l,int m) { // int for return type,static should be declared
		return l*m;
}
}
