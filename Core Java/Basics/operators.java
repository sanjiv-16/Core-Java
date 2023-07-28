public class operators {
	public static void main(String[] args) {
		int a=10,b=3,c;
		a=a%b;
		a%=b;
		System.out.println(a);
		//a++;//post increment
		System.out.println(a++);
        a++;
		System.out.println(++a);//pre increment
		//*********relational operator  < <= > >= == != **********
		System.out.println(a>b);//only boolean values as result
		System.out.println(a<b);
		char z='Z',x='X';
		System.out.println(z>x);//ASCII works in char
		//*********Bitwise operator & | ^*****
		// each value like 10 is converted into binary and 12 too
		// then these operations are done
		//negative numbers are alwase stored in 2'complement
		int m=10,n=12,o;
		o = m & n;
		System.out.println("m&n = " + o);
		o=m|n;
		System.out.println("m|n = " + o);
		o=m^n;
		System.out.println("m^n = " + o);
		/* ********leftshift right shift << >>*******
		 * here consider 4=0100 1 leftshift nah it convers as 1000 -> 0 
		 * introduced in last so it becomes as 8 same as 3 or 4 shifting
		 * if 4 shift nah 0100 -> 100000 sso value is 64 
		 * 
		 * right shift nah /2 meaning
		 * 4->0100 >> 0010 
		 * 8->1000 >> 0100 msb is replaced is sign of the value (8)as 0 value not as lestshift
		 * 8->1000 >>> 0100 msb automatic 0 added >>>
		 * -4->1000 0100 if right shifts >> the value be 1000 0010 -2 
		 * -4->1000 0100 if right shifts >>>the value be 0100 0010  2147483646*/
		int j=4;
		System.out.println("left shifts");
		System.out.println(j<<1);
		System.out.println(j<<2);
		System.out.println(j<<4);
		System.out.println(j<<30);
        int i=8;
		System.out.println("right shifts");
		System.out.println(i>>1);
		System.out.println(i>>>1);
		int k=-4;
		System.out.println(k>>1);
		System.out.println(k>>>1);
		//******* short circuit logical operator****** && || ******
		
		int h=15;
		System.out.println((h>10) && (h<=15));//true  && true ->true
		System.out.println((h<10) || (h<15));// false || false ->false
		System.out.println((h>10) & (h<=15));//values same but time consumes  a lot so short circit is used
		System.out.println((h<10) | (h<15));
	}
}
