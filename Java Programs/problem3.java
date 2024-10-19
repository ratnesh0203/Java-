/* WAP to check a triangle is equilateral, isosceles and scalene
*Jagdamba Mishra 2CSB 
*2102900100062 */
import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b && b != c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        sc.close();
    }
}
