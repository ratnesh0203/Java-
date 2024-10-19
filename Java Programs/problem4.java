/*Write a program in java that reads a floating point number and
 * print zero if the number is zero otherwise positive or negative.
 * Jagdamba Mishra 2CSB
 * 2102900100062
 */

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float f = sc.nextFloat();
        if (f == 0) {
            System.out.println("Zero");
        } else if (f > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        sc.close();
    }
}
