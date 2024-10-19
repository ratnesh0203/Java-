/*Program to check whether the three numbers are equal different,
 * or Neither equal or different
 * Jagdamba Mishra 2CSB
 * 2102900100062
 */

import java.util.Scanner;
public class problem6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            System.out.println("Enter the third number");
            int c = sc.nextInt();
            if (a == b && b == c) {
                System.out.println("All numbers are Equal");
            } else if (a != b && b != c) {
                System.out.println("All numbers are Different");
            } else if (a == b && b != c) {
                System.out.println("Neither all are equal or Different");
            }
            sc.close();
        }
    }

