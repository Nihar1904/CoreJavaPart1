package basicProgs;

abstract class Car{
	abstract void speed();
	void display() {
		System.out.println("Car class.");
	}
}
public class AbstractClassEx extends Car{

	public static void main(String[] args) {
		AbstractClassEx a= new AbstractClassEx();
		a.display();
		a.speed();
	}

	@Override
	void speed() {
		System.out.println("Speed is 400mph.");
		
	}

}
