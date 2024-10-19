import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int n = sc.nextInt();

        int[] testCases = new int[n];
        String verdicts;

        System.out.println("Enter the test:");
        for (int i = 0; i < n; i++) {
            testCases[i] = sc.nextInt();
        }

        System.out.println("Enter the value:");
        sc.nextLine(); 
        verdicts = sc.nextLine();

        int smallestFailedTestCase = findSmallestFailedTestCase(testCases, verdicts);
        System.out.println("Size of smallest failed test case: " + smallestFailedTestCase);
    }

    private static int findSmallestFailedTestCase(int[] testCases, String verdicts) {
        int minSize = Integer.MAX_VALUE;

        for (int i = 0; i < verdicts.length(); i++) {
            if (verdicts.charAt(i) == '0') { 
                minSize = Math.min(minSize, testCases[i]);
            }
        }

        return minSize == Integer.MAX_VALUE ? -1 : minSize; 
    }
}