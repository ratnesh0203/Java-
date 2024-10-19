// que7
import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <=2*N; i++) {
            for (int j = 0; j <= N; j++) {
                if (j <= i && j <= 2*N-(i+1)) {
                    System.out.print(" * ");
                }else{
                    System.out.print(" ");
                }
                sc.close();
            }System.out.println();
        }
    }
}
