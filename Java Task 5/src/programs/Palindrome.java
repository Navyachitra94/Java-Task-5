package programs;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String:");
		String input = sc.nextLine();
		
		boolean isPalindrome = true;
		
		int length = input.length();
		
		for(int i=0;i<length/2;i++) {
			if(input.charAt(i)!= input.charAt(length-1-i)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			
			System.out.println("The String is Palindrome");
			
		}else {
			
			System.out.println("The Given String is not Palindrome");
		}
		

	}

}
