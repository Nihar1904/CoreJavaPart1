package interfaceDemo;

interface Abc{
	void display1();
}
interface Pqr{
	void display2();
}
interface Xyz extends Abc,Pqr{
	void display3();
}
public class SubClass implements Abc,Pqr,Xyz{
	

	public static void main(String[] args) {
		
		SubClass s= new SubClass();
		s.display1();
		s.display2();
		s.display3();
	}

	@Override
	public void display3() {
		System.out.println("Xyz");
		
	}

	@Override
	public void display2() {
		System.out.println("Pqr");
		
	}

	@Override
	public void display1() {
		System.out.println("Abc");
		
	}

}
