import java.io.*;
import java.util.Scanner;
public class first {
	public static void main(String args[]) {
		System.out.println("hello \n world");
		int ticketprice;
		ticketprice = 0xa;
		char c='t';
		boolean paid = true;
		System.out.println(ticketprice);
		System.out.println(paid + "\nand  \n" + c);
		//user inputs string
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = ch.nextLine();//only for string nah line
	
		
		//inputs int
		System.out.println("Whats is your Rating");
		float val = ch.nextFloat();//byte=nextbyte()....
		
		ch.nextLine();//while getting string after int there will be error or skips something
		 //again string
		System.out.println("Enter your email:");
		String email = ch.nextLine();
		
		System.out.println("Hi welcome "+name);
		System.out.println("Your rating"+val);
		System.out.println("your email:"+email);
		
		
	}

}
