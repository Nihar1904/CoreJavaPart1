package basicProgs;

public class MethodOverloading {
	float add(float a,int b) {
		return (a+b);
	}
	float add(int a,float b) {
		return (a+b);
	}
	int add(int a) {
		return (a++);
	}
	float add(float a,float b,float c) {
		return (a+b+c);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		MethodOverloading m= new MethodOverloading();
		
//		int a=m.add(5, 5);
//		System.out.println(a);
//		
//		System.out.println(m.add(5, 5));
		
		m.sub(5, 2);
		System.out.println("one para:"+m.add(5));
		System.out.println("two para:"+m.add(5,6.5f));
		System.out.println("two para:"+m.add(5.3f,6));
		System.out.println("three para:"+m.add(5.5f,6.2f,7.1f));
	}
}