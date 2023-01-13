package inheritanceDemo;
class Car{
	String drivetrain1="FWD";
	String drivetrain2="RWD";
	
}
class Bugatti extends Car{
	String model="Bugatti Divo";
	void display() {
		System.out.println("Car name:- "+model);
		System.out.println("Drivetrain:- "+drivetrain2);
	} 
}
class Lamborghini extends Car{
	String model="Lamborghini Urus";
	void display() {
		System.out.println("Car name:- "+model);
		System.out.println("Drivetrain:- "+drivetrain2);
	} 
}
class RangeRover extends Car{
	String model="Range Rover Discovery";
	void display() {
		System.out.println("Car name:- "+model);
		System.out.println("Drivetrain:- "+drivetrain1);
	}
}
public class HierarchiInheritance {

	public static void main(String[] args) {
		Bugatti b=new Bugatti();
		Lamborghini l=new Lamborghini();
		RangeRover r=new RangeRover();
		b.display();
		l.display();
		r.display();

	}

}
