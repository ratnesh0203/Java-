import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate over the digits from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If we reach this point, all digits were 9
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        // Examples to test the function
        int[] example1 = {1, 2, 3};
        int[] example2 = {4, 3, 2, 1};
        int[] example3 = {8,9,9,9};

        System.out.println(Arrays.toString(plusOne(example1)));  // Output: [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(example2)));  // Output: [4, 3, 2, 2]
        System.out.println(Arrays.toString(plusOne(example3)));  // Output: [1, 0]
    }
}
