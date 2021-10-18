import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		System.out.println("Please enter a positive integer.");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (((i % 3) == 0) || ((i % 5) == 0)) {
				if ((i % 3) == 0) {
					System.out.print("Fizz");
				}
				if ((i % 5) == 0) {
					System.out.print("Buzz");
				}
			}			
			else {
				System.out.print(i);
			}
			System.out.print("\n");
		}	
		input.close();
	}

}
