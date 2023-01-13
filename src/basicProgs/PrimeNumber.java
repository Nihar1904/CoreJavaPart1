package basicProgs;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=7;
		int m=num/2;
		int flag=0;
		if(num==0||num==1) {
			System.out.println("the number is not prime.");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(num%i==0) {
					System.out.println("the number is not prime.");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("the number is prime.");
			}
		}

	}

}
