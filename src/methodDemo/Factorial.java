package methodDemo;

public class Factorial {
	
	public static void main(String[] args) {
		int num=5;
		int i;
		int fact=1;
		for(i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		System.out.println(i);
	}
}