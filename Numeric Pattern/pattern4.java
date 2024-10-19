import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <=2*N-1; i++) {
            for (int j = 1; j <= 2*N-1; j++) {
                if (j ==i){
                    System.out.println("*");
                }else if ( j <= 2*i-1) {
                    System.out.print("*");
                   
                }

            }sc.close();

}
        }
    }
