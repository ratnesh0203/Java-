import java.util.Scanner;

public class divideNumbers {
    public static int DivideNumbers(int num, int deno) {
        if (deno==0){
            return Integer.MIN_VALUE;
        }
        return num/deno;
        
    }
    public static void printDivisionResult(int num , int deno) {
        if (deno==0){
            return;
        }
        System.out.println(num/deno);
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int deno = sc.nextInt();
        // int result = DivideNumbers(num, deno);
        // System.out.println(result);
        printDivisionResult(num, deno);
        sc.close();
    }
}
