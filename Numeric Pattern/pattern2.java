import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =1 ,j=1;
        int t = i;
        for ( i = 1; i <= N; i++) {
         
            for (j = 1; j <= i; j++) {
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
