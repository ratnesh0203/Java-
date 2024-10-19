import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (col >= n - row + 1 && col <= n + row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }sc.close();
            }
            System.out.println();
        }
    }
}