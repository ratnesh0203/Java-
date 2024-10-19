import java.util.Scanner;

public class firstXterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int N = 1;
        int num = 3 * N + 2;
        if (num % 4 != 0) {
            for (N = 1; N <= x + 2 && N <= 1000; N++) {
                System.out.println(num);
                sc.close();
            }

        } else {
            N++;

        }

    }
}
