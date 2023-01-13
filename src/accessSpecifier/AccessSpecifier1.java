package accessSpecifier;

class Demo {
	private int a = 10;

	public void display() {
		System.out.println(a);
	}
}

public class AccessSpecifier1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();

	}

}
