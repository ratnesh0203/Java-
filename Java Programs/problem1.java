/*WAP to find whether a number is even or odd
 * Jagdamba Mishra 2CSB
 * 2102900100062
 */

import java.util.Scanner;
public class problem1 {
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n%2 == 0) {
			System.out.println("Even");
		
		}
		else {
			System.out.println("Odd");
			sc.close();
		}

	}

}


