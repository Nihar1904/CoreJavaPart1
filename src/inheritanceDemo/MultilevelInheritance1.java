package inheritanceDemo;

class GrandFather{
	String property1="GrandFather's Property";
}
class Father extends GrandFather{
	String property2="Father's Property";
}
class Child extends Father{
	String property3="Child's Property";
	void access() {
		System.out.println(property1);
		System.out.println(property2);
		System.out.println(property3);
	}
}
public class MultilevelInheritance1 {

	public static void main(String[] args) {
		Child c= new Child();
		c.access();
	}

}
