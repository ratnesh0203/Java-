import java.util.Scanner;

public class arr {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int N = s.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = s.nextInt();
        }
        int ans = sum(arr);
        System.out.println(ans);
    }

}
