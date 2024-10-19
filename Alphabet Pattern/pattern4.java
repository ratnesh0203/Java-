import java.util.Scanner;

public class pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {

            char ch = (char) ('A' + N - i);
            for (int j = 1; j <= i; j++) {

                if (j <= i && j <= N) {
                    System.out.print(ch);
                    ch++;
                } else {
                    System.out.print("");
                }

                sc.close();
            }
            System.out.println();

        }
    }
}
