public class linearSearch {
   public static void main(String[] args) {
    int[] nums = {12, 13, 45, 23, 16, 49};
    int ele = 23;
    int ans = LinearSearch(nums, ele);
    System.out.println(ans);
   }  

   static int LinearSearch(int[] nums, int ele){
    if(nums.length == 0 ){
        return -1;
    }
    
    for (int i = 0; i<nums.length;i++){
        if(nums[i] ==  ele ){
            return i;
        }
    }
    return -1;
   }
}
