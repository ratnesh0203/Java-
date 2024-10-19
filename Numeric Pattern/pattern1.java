import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int t = i;
            for (int j = 1; j <= i; j++) {
                if (j <= i && j <= N) {

                    System.out.print(t);
                    t++;
                } else
                    System.out.print("");
            }
            System.out.println();
            sc.close();
        }

    }
}
