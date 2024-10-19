import java.util.Scanner;

public class binarySearch {
    public static int search(int[] nums, int target,int low,int high) {
        low = 0;
        high = nums.length;
        int mid = (low+high)/2;
        while (low <= high) {
            if (target == nums[mid]) {
                return mid;
            } 
            else if (target > nums[mid]) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int nums[] = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = s.nextInt();
        }
        int target = s.nextInt();
        int index = search(nums, target, 0 ,mid, N-1 );
        System.out.println(index);
        s.close();
    }
}