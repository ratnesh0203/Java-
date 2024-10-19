import java.util.Scanner;

public class xTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        for (int N = 1; count < x; N++) {

            int num = 3 * N + 2;
            if (num % 4 != 0) {
                System.out.print(num + " ");
                count++;
            }
        }
        sc.close();
    }
}
