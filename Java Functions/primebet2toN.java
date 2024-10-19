import java.util.Scanner;

public class primebet2toN {
    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
           if(i%1==0 && i%n==0){
            System.out.println(i);
           }
        }
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        printPrimes(100);
        sc.close();
    }
}
