package basicProgs;

public class ThisMethod {
	int a,b;
	
	public ThisMethod(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Before Method call "+this.a+" and "+this.b);
		multiply(this);
		System.out.println("After Method call "+this.a+" and "+this.b);
	}
	void multiply(ThisMethod t) {
		t.a*=5;
		t.b*=2;
		
	}
	
	public static void main(String[] args) {
		ThisMethod t1=new ThisMethod(5, 6);
	}

}
