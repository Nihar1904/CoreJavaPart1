package basicProgs;

public class TypecastingEx {

	public static void main(String[] args) {
		
		// implicit/widening (byte->short->int)
		byte b=20;
		int i=b;
		System.out.println(i);
		
		// explicit/narrowing (int->short->byte)
		int i1=30;
		byte b1=(byte)i1;
		System.out.println(b1);
		
		
		String s="20"; 
		int f=Integer.parseInt(s); 
		System.out.println(f);
		 
	}

}
