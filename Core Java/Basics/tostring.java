import java.util.*;
public class tostring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		model rx=new model(a,b,c);
		System.out.println(rx);
		
	}

}
 class bikes {
	 private int gears;
	 private int speed;
	 bikes(int a, int b){
		 
		 this.gears=a;
		 this.speed=b;
	 }
	public String toString() {
		return "gears=" + gears + "\n speed=" + speed ;
	}
	
}
 class model extends bikes{
     private int height;

	public model(int a, int b, int h) {
		super(a, b);
		this.height = h;
	}

	public String toString() {
		return super.toString() + "\n height=" + height  ;
	}
	
	 
 }
