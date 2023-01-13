package exceptionDemo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int a=3,b=0;
		try {
			//int[] c= {1,2,3,4};
			//System.out.println(c[30]);
			
//			a=Integer.parseInt(null);
//			System.out.println("a:-"+a);
//			
//			b=Integer.parseInt("Hi");
//			System.out.println("b:-"+b);
//			
//			int c=Integer.parseInt("90");
//			System.out.println("c:-"+c);
			
			String s=null;
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println("Exception Occured!");
		}
		finally {
			System.out.println("Finally block");
		}
	}
}