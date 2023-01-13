package exceptionDemo;

import java.util.Scanner;

class InvalidMarksException extends Exception{
	String s;
	public InvalidMarksException(String s) {
		this.s=s;
	}
	@Override
	public String toString() {
		return s;
	}
}
public class ExceptionDemo4 {
	static void marksChecker(int m) throws InvalidMarksException{
		if(m<0 || m>100) {
			throw new InvalidMarksException("Invalid marks.");
		}
		else {
			System.out.println("Valid marks.");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks:- ");
		int m=sc.nextInt();
		try {
			marksChecker(m);
		} catch (InvalidMarksException e) {
			System.out.println(e.toString());
		}
	}
}
