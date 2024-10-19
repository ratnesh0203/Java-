import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            if(n%2==0){
                for(n=2;n<=5;){
                    System.out.println("Not Wired");
                }
            }
        }


    }
}
