import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        if (i>j && i>k){
            System.out.println(i);
        }
        else if (j>i && j>k){
            System.out.println(j);
        }
        else{
            System.out.println(k);

        }sc.close();
    }
}
