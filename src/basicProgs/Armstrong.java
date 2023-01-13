package basicProgs;

public class Armstrong {

	public static void main(String[] args) {
		int num=257;
		int n=num;
		int og=num;
		int sum=0;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		while(num>0) {
			int rem=num%10; //1)rem=7 2)rem=5 3)rem=2 
			sum+=Math.pow(rem, count); //1)sum=7 2)sum=12 3)sum=14
			num/=10; //1)num=25 2)num=2 3)num=0
		} 
		System.out.println(sum);
		if(og==sum)
			System.out.println("It is an Armstrong number");
		else
			System.out.println("It is not an Armstrong number");
	}
}