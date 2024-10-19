import java.util.Scanner;

public class pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j <=i && j <= N) {
                    System.out.print(j);
                }else
                System.out.print("");
              

            }System.out.println();
            sc.close();

        }

    }
}
