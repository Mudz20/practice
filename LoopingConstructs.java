package practice;

	import java.util.Scanner;

	public class LoopingConstructs {
    
	public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
        
        int rows;
		
		System.out.println("Let's form a right triangle with numbers.");
		System.out.println();
		
		System.out.print("Enter number of rows (2-10): ");
		rows = scan.nextInt();
		
		System.out.println();
		
		
		int y = 1;
		while (y<=rows) {
			
			y++; // y increases until given number
			
			// its value then becomes 123456789... until the given number
			
			System.out.println(); // i don't know yet why this is necessary, for spaces?
			// but when we use ++, it increases automatically on next sentence, so why?
			
			int q = 1; // so q starts with 1
			
			while (q<y) { //q is less than y, so less than the given number, right? so why the console is showing otherwise?
				
				System.out.print(q); // print q
				q++; // q increases, so 1, 12, 123... and so on, depends on y
			
			}
		}
		
        
	}
}