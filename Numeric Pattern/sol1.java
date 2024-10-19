import java.util.Scanner;

public class sol1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char c = sc.next().charAt(0);
        c='A';
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j >=i && j <= N) {
                    System.out.print(c);
                   
             
                }else
                System.out.print("");
            c++;
            }
            System.out.println();
            sc.close();

        }

    }
}
