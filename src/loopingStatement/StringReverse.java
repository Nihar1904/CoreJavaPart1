package loopingStatement;

public class StringReverse {

	public static void main(String[] args) {
		String s="Hello";
		
		//using loop
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		
		//using StringBuilder
		StringBuilder s1=new StringBuilder(s);
		StringBuilder rev1=s1.reverse();
		System.out.println(rev1);
		
		//using toCharArray
		char[] arr=s.toCharArray();
		System.out.print("**");
		System.out.println(arr);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}

}
