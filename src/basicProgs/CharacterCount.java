package basicProgs;

import java.util.Scanner;

public class CharacterCount {
	public static void charCount(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("Character count of "+c+" is "+count);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s;
		char c;
		System.out.println("Enter a string:- ");
		s=sc.nextLine();
		System.out.println("Enter a character:- ");
		c=sc.next().charAt(0);
		charCount(s,c);
	}

}
