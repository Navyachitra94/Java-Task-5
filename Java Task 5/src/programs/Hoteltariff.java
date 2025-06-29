package programs;

import java.util.Scanner;

public class Hoteltariff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 	int month = sc.nextInt();            
	        double rentADay = sc.nextDouble();
	        int days = sc.nextInt(); 
	        double totalTariff;
	        
	        
	        switch (month) {
            // Peak months
            case 4: case 5: case 6: case 11: case 12:
                totalTariff = rentADay * 1.2 * days; // 20% 
                break;

            // Non-peak months
            case 1: case 2: case 3: case 7: case 8: case 9: case 10:
                totalTariff = rentADay * days;
                break;

            default:
                System.out.println("Invalid Month");
                sc.close();
                return;
        }     
        System.out.printf("%.2f\n", totalTariff);

	}

}
