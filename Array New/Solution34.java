public class Solution34 {
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
               if(nums[i]== target & nums[j] == target){
                res[i] =i;
                res[j] = j;
                return res;
                } 
            }
            
        }
        return nums;
      
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = searchRange(nums, target);
        System.out.println(res);
    }
}