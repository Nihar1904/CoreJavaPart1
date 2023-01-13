package exceptionDemo;

public class ThrowDemo {
	static void Age(int age) {
		if(age<18) {
			throw new ArithmeticException("Must be at least 18 yrs old to watch the movie.");
		}
		else {
			System.out.println("Access granted to watch the movie.");
		}
	}
	public static void main(String[] args) {
		Age(25);
	}

}
