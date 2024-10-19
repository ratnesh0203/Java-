import java.util.Scanner;

public class linearSearch {

    public static int linearSearchProb(int arr[], int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int N = s.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            int x = s.nextInt();
            int index = linearSearchProb(arr, x);
            System.out.println(index);
            s.close();
        }
    }
}