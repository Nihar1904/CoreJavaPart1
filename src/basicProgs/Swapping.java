package basicProgs;

public class Swapping {

	public static void main(String[] args) {
		// without using temp
		int a=5,b=300;
		a=a+b; //a=305
		b=a-b; //b=305-300=5
		a=a-b; //a=305-5=300
		System.out.println(a);
		System.out.println(b);
		
		//using temp
		a=5;
		b=300;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

}
