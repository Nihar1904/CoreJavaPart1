package basicProgs;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		//int a=1;
		for(int r=1;r<=n;r++) {
			
			for(int s=n;s>=r;s--) {
				System.out.print(" ");
			}
			
			for(int c=1;c<=r;c++) {
				System.out.print("*");
				//a++;
			}
			System.out.println();
		}

	}

}
