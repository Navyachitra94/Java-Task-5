package programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String:");
		String input = sc.nextLine();
		
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--) {
			
			reverse += input.charAt(i);
		}
		
		System.out.println("The Reversed String is:" +reverse);

	}

}
