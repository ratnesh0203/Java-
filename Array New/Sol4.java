import java.util.Arrays;

public class Sol4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int a2 = nums2.length;
        int c1 = a1 + a2;
        int[] c = new int[c1];

        System.arraycopy(nums1, 0, c, 0, a1);
        System.arraycopy(nums2, 0, c, a1, a2);
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        if (c1 % 2 == 0) {
          int z = c1 / 2;
          int e = c[z];
          int q = c[z - 1];

          int ans = (e + q) / 2;
          return ans;
      }

      // If length if array is odd
      else {
          int z = Math.round(c1 / 2);
          return c[z];
      }
  }
    
    public static void main(String[] args) {
      int[] nums1 = {1, 3, 4};
      int[] nums2 = {2,7,9};
      double result = findMedianSortedArrays(nums1, nums2);
      System.out.println(String.format("%.0.5f", result));
    }
}
