

public class opentext {
	public static void main(String[] args) {
		int n=5000;
		int a=000;
		String str=String.valueOf(n);
		StringBuilder sb=new StringBuilder(str);
		int i=0;
		while(i<sb.length()) {
			if(sb.charAt(i)=='5') {
				sb.delete(i, i+1);
				break;
			}
			i++;
			
		}
		int  c=Integer.parseInt(sb.toString());
		System.out.print(c);
		System.out.print(a);
	}

}
