import java.util.*;
class pattern {
	public static void main(String[] a) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int n=(2*no)+1;
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=no;j++) {
				if(j<=i) {
					if(j%2!=0) {
						System.out.print("0");
					}
					else {
						System.out.print("1");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			for(int k=no;k>0;k--) {
				if(k<=i) {
					if(k%2!=0) {
						System.out.print("0");
					}
					else {
						System.out.print("1");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
