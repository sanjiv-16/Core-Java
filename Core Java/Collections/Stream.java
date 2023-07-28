import java.util.*;

public class Stream {
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7);
		//ls.forEach(n-> System.out.print(n+" "));
		ls.stream()
				.filter(n -> n%2==0).forEach(n-> System.out.print(n+" "));
				//.reduce(0,(c,e)->c+e);
	
	}

}
