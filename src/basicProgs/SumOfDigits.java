package basicProgs;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=257;
		int sum=0;
		while(num>0) {
			int rem=num%10; //1)rem=7 2)rem=5 3)rem=2 
			sum+=rem; //1)sum=7 2)sum=12 3)sum=14
			num/=10; //1)num=25 2)num=2 3)num=0
		} 
		System.out.println(sum);

	}

}
