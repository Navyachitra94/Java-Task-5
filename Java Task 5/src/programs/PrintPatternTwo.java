package programs;

import java.util.Scanner;

public class PrintPatternTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Line of numbers:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("**");  
            } else {
                System.out.println("*");  
            }
        }

	}

}
