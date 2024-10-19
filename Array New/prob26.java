class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        
        return k + 1;
    }
    public class prob26{

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println(k1);  // Output: 2
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");  // Output: 1 2
        }
        System.out.println();
    }
}
}