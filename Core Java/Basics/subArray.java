import java.util.*;
public class subArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		int i=0;
		while(i++<n){
			arr.add(sc.nextInt());
			
		}
		int n2=sc.nextInt();
		ArrayList<Integer> arr1=new ArrayList<>();
		for(int j=0;j<n2;j++) {
			arr1.add(sc.nextInt());
		}
		if(n<n2) {
			check(arr1,arr);
		}
		else {
			check(arr,arr1);
		}
		
	}

	private static void check(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=0;i<arr2.size();i++) {
			if(arr1.contains(arr2.get(i))){
				c++;
				
				
			}
			else {
				System.out.println("not sub array");
				break;
			}
		}
		if(c==arr2.size()) {
		System.out.println("subArray");
		}
	}

}
