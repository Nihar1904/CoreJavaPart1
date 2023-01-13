package inheritanceDemo;

class Vehicle {
	String vehicle = "Car";
}

class Brand extends Vehicle {
	String brand = "Tata";
}

class Model extends Brand {
	String model = "Harrier";
}

public class MultilevelInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m = new Model();
		System.out.println("Vehicle type:- " + m.vehicle);
		System.out.println("Brand name:- " + m.brand);
		System.out.println("Model name:- " + m.model);
	}
}