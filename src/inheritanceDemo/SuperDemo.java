package inheritanceDemo;

import java.util.Scanner;

class Student1{
	String name;
	int rno;
	public Student1(String name,int rno) {
		this.name=name;
		this.rno=rno;
	}
}
class Engg extends Student1{
	String branch="Comps";
	Engg(){
		super("Nihar",77);
	}
	void display() {
		System.out.println("Name:- "+super.name);
		System.out.println("Roll no:- "+super.rno);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		
		Engg e=new Engg();
		e.display();
	}

}
