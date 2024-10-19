import java.util.Scanner;
public class prime {
    public static boolean isprime (int n){
     int d=2;
     while(d<n){
        if (n%d==0){
            return false;
        }
        d++;
     }
     return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int r = sc.nextInt();
    
    boolean ans = isprime(13);
    System.out.println(ans);
    sc.close();
}
}
