import java.util.*;
import java.util.Map.Entry;
public class hashMap {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int n=sc.nextInt();
		int t=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		TreeMap<Integer,Integer> hm=new TreeMap<>();
		for(int i=0;i<arr.size();i++) {
			if(hm.containsKey(arr.get(i))) {
				hm.replace(arr.get(i), hm.get(arr.get(i)),hm.get(arr.get(i))+1 );
			}
			else {
				hm.put(arr.get(i), 1);
			}
		}
		for (Entry<Integer, Integer> set :hm.entrySet()) {
			if(t>0) {
           System.out.println(set.getKey());
           t--;
       }
		}
		
	}

}
