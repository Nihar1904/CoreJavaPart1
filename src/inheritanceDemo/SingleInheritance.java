package inheritanceDemo;


class Student{
	int sid=19;
	public void display1() {
		System.out.println("Student ID:- "+sid);
	}
}
class EnggStud extends Student{
	String stream="Comps";
	public void display2() {
		System.out.println("Stream:- "+stream);
	}
}
public class SingleInheritance {

public static void main(String[] args) {
		EnggStud e1= new EnggStud();
		e1.display1();
		e1.display2();
	
	}
}