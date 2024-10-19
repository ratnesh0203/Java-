import java.util.Arrays;

class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closeSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i<n-2;i++){
            int left = i+1;
            int right = n - 1;
            while(left<right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(currentSum - target) < Math.abs(closeSum - target)){
                    closeSum = currentSum;
                }
                if(currentSum < target){
                    left++;
                }
                else if(currentSum > target){
                    right--;
                }
                else{
                    return currentSum;
                }
            }
        }
        return closeSum;
    }
    public static void main(String[] args){
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = threeSumClosest(nums, target);
        System.out.println(result);
    }

}