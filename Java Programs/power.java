import java.util.Scanner;
public class power {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int pow;
        pow = (int)Math.pow(x, n);
        System.out.println(pow);
        sc.close();
        
        
    }
}