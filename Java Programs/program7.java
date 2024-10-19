/*Check whether the three numbers are increasing, decreasing and 
 * neither increasing or decreasing
 * Jagdamba Mishra 2CSB
 * 2102900100062
 */


import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println("Increasing");
        } else if (a > b && b > c) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither Increasing or Decreasing");
        }
        sc.close();
    }
}
