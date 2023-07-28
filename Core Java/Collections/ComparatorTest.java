import java.util.*;

public class ComparatorTest implements Comparable{
	public static void main(String[] args) {
		List<String> ls=new ArrayList<>();
		
		Comparator<String> com=new Comparator<String>() {

			public int compare(String o1, String o2) {
				if(o1.length()>o2.length()) return 1;
				return -1;
			}
		};
		ls.add("sanjiv");
		ls.add("sibi");
		ls.add("santhosh");
		ls.add("raj");
		Collections.sort(ls,com);
		System.out.print(ls);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
