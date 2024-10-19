import java.util.Scanner;

public class pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count;
        for (int i = 1; i <= N; i++) {
            count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count--;
            }
            System.out.println();

        }
        sc.close();

    }

}
