import java.util.Scanner;

public class L7SorP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int sum = 0;
        int pdt = 1;
        if (C == 1) {
            for (int i = 1; i <= N; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else if (C == 2) {
            for (int j = 1; j <= N; j++) {
                pdt = pdt * j;
            }
            System.out.println(pdt);

        } else {
            System.out.println(-1);
            sc.close();
        }
    }
}
