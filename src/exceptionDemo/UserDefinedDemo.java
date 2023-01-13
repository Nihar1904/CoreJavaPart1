package exceptionDemo;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	String excp;
	public InvalidAgeException(String excp) {
		this.excp=excp;
	}
	@Override
	public String toString() {
		return excp;
	}
}

public class UserDefinedDemo {
	static int age;
	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:- ");
		age=sc.nextInt();
		try {
			if(age<18) {
				throw new InvalidAgeException("Invalid Age. Age must be greater than or equal to 18.");
			}
			else {
				System.out.println("You are eligible for voting.");
			}
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}
}