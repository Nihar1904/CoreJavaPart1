package exceptionDemo;

import java.util.Scanner;

class NegativeNumberException extends Exception{
	String excp="Negative numbers are invalid for this operation. Enter a positive number.";
	@Override
	public String toString() {
		return excp;
	}
	@Override
	public String getMessage() {
		return excp;
	}
}
public class ExceptionDemo2 {
		static void add(int a,int b) throws NegativeNumberException{
			if(a<0 || b<0) {
				throw new NegativeNumberException();
			}
			else {
				System.out.println("Addition is:- "+(a+b));
			}
		}
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			add(a,b);
		}catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
