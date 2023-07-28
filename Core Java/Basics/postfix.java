import java.util.*;
public class postfix {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(evaluate(str));
	}

	private static int evaluate(String str) {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isDigit(c)) {
				st.push(c-'0');
			}
			else {
				int a=st.pop();
				int b=st.pop();
				switch(c) {
				case '+':
					st.push(a+b);
					break;
				case '-':
					st.push(a-b);
					break;
				case '*':
					st.push(a*b);
					break;
				case '/':
					st.push(a/b);
					break;
				}
			}
		}
		return st.pop();
	}

}
