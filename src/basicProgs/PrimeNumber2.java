package basicProgs;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Prime numbers from "+a+" and "+b+" are: ");
		for(int num=a;num<=b;num++) {
			int m=num/2;
			int flag=0;
			if(num==0||num==1) {
				//System.out.println("the number is not prime.");
			}
			else {
				for(int i=2;i<=m;i++) {
					if(num%i==0) {
						//System.out.println("the number is not prime.");
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.print(num+",");
				}
			}
		}
	}
}