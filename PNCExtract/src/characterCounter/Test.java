package characterCounter;

import java.util.Scanner;

public class Test {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = scanner.nextInt();
		int result = 0; 
		scanner.close();

		if (N >= 2 && N <= 20 ) {
			for (int i = 1; i < 10; i++)
			{             
				result = i * N;  
				System.out.println(N + "x" + i + "=" + result);
				
			}
		
		}
		
	}

}