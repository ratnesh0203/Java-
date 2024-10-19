public class Prob66{
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        // int[] example1 = {1, 2, 3};
        // int[] example2 = {4, 3, 2, 1};
        // int[] example3 = {9};

        // System.out.println(Arrays.toString(plusOne(example1)));  // Output: [1, 2, 4]
        // System.out.println(Arrays.toString(plusOne(example2)));  // Output: [4, 3, 2, 2]
        // System.out.println(Arrays.toString(plusOne(example3))); 
       
    
      }
}
