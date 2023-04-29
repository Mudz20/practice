
package practice;

	import java.util.*;

public class Information {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		String Binan;
		
		System.out.println("BARANGAYS IN BINAN: Ganado, Mamplasan, Lankiwa");
		System.out.println();
			
		System.out.print("Enter Barangay: ");
		Binan = scan.next().toUpperCase();
		
		System.out.println();
			
			switch (Binan) {
				case "GANADO":
					System.out.println("You entered Ganado. "
							+ "What do you like to know?");
					System.out.println("1. Population");
					System.out.println("2. Food");
					
						String Choice;
						
						System.out.println("Enter Here: ");
						Choice = scan.next().toUpperCase();
						
							switch (Choice) {
							case "FOOD":
								System.out.println("They are abundant in bananas.");
								break;
							case "POPULATION":
								System.out.println("5,000");
								break;
							}
					
					break;
				case "MAMPLASAN":
					System.out.println("Second Barangay");
					break;
				case "LANKIWA":
					System.out.println("Third Barangay");
					break;
				default:
					System.out.print("Invalid Input");
					break;
			}

	}

}

