
import java.util.Scanner;

public class solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character :");
        char c = sc.next().charAt(0);
        // int a = n;
        if (c >= 65 && c <= 90) {
            System.out.println("1");
        } else if (c >= 97 && c <= 122) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
        sc.close();

    }
}
