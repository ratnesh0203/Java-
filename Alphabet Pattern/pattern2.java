import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            // char ch = (char)('A' + i - 1);
            for (int j = 1; j <= N; j++) {
                System.out.print((char)('A'+j-1));
                // ch = (char) (ch +1);
                sc.close();
            }
            System.out.println();

        }
    }
}
