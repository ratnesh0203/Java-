// que1
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (j >= N-i-2 && j <= N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                sc.close();
            }System.out.println();
        }
    }
}
