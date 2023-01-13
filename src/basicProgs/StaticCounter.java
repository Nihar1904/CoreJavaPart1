package basicProgs;

public class StaticCounter {
	int a;
	static int b;
	public StaticCounter() {
		a++;
		b++;
	}
	public static void main(String[] args) {
		StaticCounter sc1=new StaticCounter();
		StaticCounter sc2=new StaticCounter();
		StaticCounter sc3=new StaticCounter();
		StaticCounter sc4=new StaticCounter();
		StaticCounter sc5=new StaticCounter();
		System.out.println(sc1.a);
		System.out.println(sc3.a);
		System.out.println("static");
		System.out.println(StaticCounter.b);
	}
}