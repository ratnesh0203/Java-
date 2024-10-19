import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       for(int i=2;i<=N;i++){
    int count = 0;
    for(int j=2; j<=i;j++){
        if (i%j==0)
        count++;
    }if (count==1){
        System.out.println(i);
    }

       }sc.close();
    }

}
