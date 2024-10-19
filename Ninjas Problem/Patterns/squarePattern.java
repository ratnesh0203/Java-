// import java.util.Scanner;

// public class squarePattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int i=1;
//         while (i<=N){
//             int j=1;
//             while(j<=N){
//                 System.out.print("*");
//                 j++;
//             }System.out.println();
//             i++;
//             sc.close();
//         }

//         sc.close();
//         }
//     }
import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int val = N;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(val);
              sc.close();
            }
            System.out.println();
        }
    }
}
