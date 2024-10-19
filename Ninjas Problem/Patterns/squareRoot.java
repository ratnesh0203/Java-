import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int result = findSquareRoot(N);
        System.out.println(result);
    }
    
    public static int findSquareRoot(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        
        int start = 1, end = N, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == N) {
                return mid;
            }
            if (mid * mid < N) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
