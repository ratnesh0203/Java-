import java.util.Scanner;

public class diamondpat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= n - i + 1 && j <= n + i - 1) {
                    System.out.print("*");
                } else if (j>n-i-1 && j<n-i+1) {

                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                sc.close();
            }
            System.out.println();
        }
    }
}