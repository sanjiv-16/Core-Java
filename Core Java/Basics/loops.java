import java.util.*;
public class loops {
	
	public static void main(String[] a) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		Set<Integer> s=new HashSet<>(); 
		for(int i=0;i<n;i++) {
		if(s.add(arr[i])==false) {
			System.out.println(i);
			break;
		}
			
		}
		
		//loopssam ls=new loopssam();
		//loops ls=new loops();
		//int sum=sumOf(arr,n);
		//System.out.println();
	}
	/*public static int sumOf(int[] arr,int n) {
		int t=0;
		for(int i=0;i<n;i++) {
			t+=arr[i];
		}
		return t;
	}*/

}
