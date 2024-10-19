/*Test whether the two Floating point numbers are same upto
 * three decimal places or not.
 * Jagdamba Mishra 2CSB
 * 2102900100062
 */


import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        float a = sc.nextFloat();
        System.out.println("Enter the Second Number");
        float b = sc.nextFloat();

        a = a * 1000;
        b = b * 1000;
        if (a == b) {
            System.out.println("The two numbers are Same");
        } else {
            System.out.println("The two numbers are not same");
        }
        sc.close();
    }
}
