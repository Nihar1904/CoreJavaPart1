package basicProgs;
class Hello{
	static int add(int a,int b) {
		return a+b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	float div(float a,float b) {
		return a/b;
	}
	String greet(String n) {
		return "Hello "+n;
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		Hello h= new Hello();
		System.out.println("Multiply:- "+h.mul(2, 3));
		String s=h.greet("Nihar");
		System.out.println(s);
		System.out.println("Division:- "+h.div(5.6f, 2.3f));
		int sum=Hello.add(10, 20);
		System.out.println("Sum:- "+sum);
	}

}
