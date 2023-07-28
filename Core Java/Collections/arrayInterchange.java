import java.util.*;
public class arrayInterchange {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		if(a1>n || a2>m) {
			System.out.println("Invalid");
		}
		else {
			int[] temp=new int[m];
			temp=arr[a1-1];
			arr[a1-1]=arr[a2-1];
			arr[a2-1]=temp;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}

}
