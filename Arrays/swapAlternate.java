import java.util.Scanner;

public class swapAlternate {

    public static void swapAlt(int arr[]) {

        for (int i = 0; i < arr.length - 1; i = i + 2) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int testcase = 0; testcase < t; testcase++){
        int N = s.nextInt();
        int arr[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
       swapAlt(arr);
      for (int i = 0; i < N; i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
       s.close();
    }
}
}