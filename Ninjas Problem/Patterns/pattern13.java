import java.util.Scanner;
public class pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
              System.out.print(j);
            }System.out.println();
            
        }
        sc.close();

    }

}

