package controlStatement;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char op;
		do {
		System.out.println("Enter which operation to perform:\n1)+\n2)-\n3)/\n4)*\n5)e(for exit) ");
		op=sc.next().charAt(0);
		
		switch(op) {
		case '+': {
			System.out.println("Enter two numbers: ");
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			int sum=no1+no2;
			System.out.println("Addition is: "+sum);
			break;
		}
		case '-': {
			System.out.println("Enter two numbers: ");
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			int sub=no1-no2;
			System.out.println("Subtraction is: "+sub);
			break;
		}
		case '/': {
			System.out.println("Enter two numbers: ");
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			int div=no1/no2;
			System.out.println("Division is: "+div);
			break;
		}
		case '*': {
			System.out.println("Enter two numbers: ");
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			int mul=no1*no2;
			System.out.println("Multiplication is: "+mul);
			break;
		}
		case 'e':{
			System.exit(0);
			break;
		}
		default: System.out.println("Enter a valid operation.");
		}
		}while(op!='e');
	}
}
