public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length ==0) 
        return 0;
        int k =0;
        for(int i =0; i<nums.length;i++){
          if(nums[i] != val){
            nums[k] = nums[i];
            k = k+1;
          }
        }
    
    return k;  
    }
    public static void main(String[] args) {
       Solution sol = new Solution();
       int[] nums = {3,2,2,3};
       int k1 = sol.removeElement(nums, 3);
       System.out.println(k1);
       for(int i =0; i<k1;i++){
        System.out.print(nums[i] + " ");
       }
       System.out.println();
    }
  }
