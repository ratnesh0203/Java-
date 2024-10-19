public class Sol33 {
    public static int searchNum(int[] nums, int target) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int i = 0;
        for (i = 0; i < n; i++) {
            if (nums[i] == target)
                return i;
        }
        for (i = 0; i < n; i++) {
            if (nums[i] > target)
            return i;
        }
        return n;  
    }

    public static void main(String[] args) {
        int[] nums = { 0,1,3,5,6,9};
        int target = 2 ;
        int res = searchNum(nums, target);
        System.out.println(res);
    }
}
