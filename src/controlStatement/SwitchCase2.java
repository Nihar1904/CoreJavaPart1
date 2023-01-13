package controlStatement;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade (A/B/C/D): ");
		char gd=sc.next().charAt(0);
		switch(gd) {
		case 'A': {
			System.out.println("Excellent");
			break;
		}
		case 'B': {
			System.out.println("Good");
			break;
		}
		case 'C': {
			System.out.println("Satisfactory");
			break;
		}
		case 'D': {
			System.out.println("Fail");
			break;
		}
		default: System.out.println("Enter a valid grade");
		}

	}

}
