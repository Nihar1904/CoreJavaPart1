package pack1;

public class Abc {
	protected int p=10;
	public static void main(String[] args) {
		Abc abc=new Abc();
		System.out.println(abc.p);

	}

}
class AbcSub extends Abc{
	public void display() {
		System.out.println(p);
	}
}