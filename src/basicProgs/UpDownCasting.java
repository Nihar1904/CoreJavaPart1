package basicProgs;

class ParentClass{
	int p=20;
	void display1() {
		System.out.println("Parent class");
	}
}

class ChildClass extends ParentClass{
	int c=30;
	void display2() {
		System.out.println("Child class");
	}
}
public class UpDownCasting {
	
	public static void main(String[] args) {
		ParentClass p1=new ChildClass();
		p1.display1();
		System.out.println("Parent class variable:- "+p1.p);
		
		ChildClass c1=(ChildClass)p1;
		c1.display1();
		c1.display2();
		System.out.println("Parent class variable:- "+c1.p);
		System.out.println("Child class variable:- "+c1.c);

	}

}
