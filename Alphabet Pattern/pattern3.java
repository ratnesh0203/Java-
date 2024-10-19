import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j<=i && j<=N){
                    System.out.print((char)('A'+i-1));
                }else{
                    System.out.print("");
                }
               
                sc.close();
            }
            System.out.println();

        }
    }
}
