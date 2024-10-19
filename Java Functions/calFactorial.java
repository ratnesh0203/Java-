import java.util.Scanner;

public class calFactorial {
    public static void factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        System.out.println(ans);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }
}
