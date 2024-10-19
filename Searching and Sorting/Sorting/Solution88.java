import java.util.Arrays;

public class Solution88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
      m = nums1.length;
      n = nums2.length;
      m = m + n;
      System.arraycopy(nums1, 0, nums1, 0, m);
      System.arraycopy(nums2, 0, nums1, m, n);
      Arrays.sort(nums1);
     System.out.println(nums1);
    } 
    public static void main(String[] args) {
     int[] arr1 = {1,2,3,0,0,0};
     int m = arr1.length;
     int[] arr2 = {2,5,6};
     int n = arr2.length;
     int result = 
    }
}
