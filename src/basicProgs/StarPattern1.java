package basicProgs;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		for(int r=0;r<n;r++) {
			for(int c=n;c>r;c--) {
				//char ch=(char) (c+65);
				System.out.print("*");
			}
			System.out.println();
		}
	}
}