import java.util.*;
public class frequency {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		int c[]=new int[str.length];
		List<String> list=new ArrayList<String>(Arrays.asList(str));
		for(int i=0;i<str.length;i++) {
			if(list.contains(str[i])) {
				c[i]++;
				list.remove(str[i]);
				
			}
			System.out.println(str[i]+c[i]);
		
			
		}
		
		/*int c[]=new int[str.length];
		for(int i=0;i<str.length;i++) {
			for(int j=i;j<str.length;j++)
				if(str[i].equals(str[j])) {
					c[i]++;
					push(str[i]);
				}
				
		}
		for(int j=0;j<str.length;j++)
			System.out.println(str[j] + c[j]);
		
	}
	public void push(String str) {
		c.remove*/
		
	}

}
