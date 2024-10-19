// que12
import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <=N; i++) {
            for (int j = 1; j <= 2*N-1; j++) {
                if (j>=i+1 && j<=2*N-i-1) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                sc.close();
            }System.out.println();
        }
    }
}
