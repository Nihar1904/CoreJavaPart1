package inheritanceDemo;

import java.util.Scanner;

class Addition{
	Scanner sc=new Scanner(System.in);
	int a,b;
	void getValues() {
		System.out.println("Enter two numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void add() {
		System.out.println("Addition is:- "+(a+b));
	}
}
class Subtract extends Addition{
	void sub() {
		System.out.println("Subtraction is:- "+(a-b));
	}
}
class Multiply extends Subtract{
	void mul() {
		System.out.println("Multiplication is:- "+(a*b));
	}
}
class Divide extends Multiply{
	void div() {
		System.out.println("Division is:- "+(a/b));
	}
}
public class MultilevelInheritance3 {

	public static void main(String[] args) {
		Divide d= new Divide();
		d.getValues();
		d.add();
		d.sub();
		d.mul();
		d.div();
	}

}
