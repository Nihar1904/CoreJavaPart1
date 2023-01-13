package loopingStatement;

public class Palindrome {

	public static void main(String[] args) {
		int num=131;
		int og=num;
		String r="";
		while(num>0) {
			int rem=num%10;
			r+=rem;
			num=num/10;
		}
		int rev=Integer.parseInt(r);
		if(og==rev)
			System.out.println("Number is palindrome.");
		else
			System.out.println("Number is not palindrome.");

	}

}
