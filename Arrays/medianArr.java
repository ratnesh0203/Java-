import java.util.Scanner;

public class medianArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int c = m + n;
        int [] c1 = new int[c];
        float median;
        if (c % 2 == 0){
           median = (c1.length + 1)/2;
        }else{
            median =((c1.length)/2 + (c + 1)/2);
        }
        return median;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1, 3};
        int [] nums2 = {2};
        int ans = (int) findMedianSortedArrays(nums1 , nums2);
        System.out.println(ans);
        sc.close();
    }
    
}
