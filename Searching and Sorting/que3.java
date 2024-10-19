import java.util.Arrays;
import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        
        System.out.print("Enter the number of students passing: ");   
        int x = sc.nextInt();

        
        int[] marks = new int[n];
        System.out.println("Enter the marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int passingMark = findPassingMark(marks, x);
        System.out.println("Maximum passing mark: " + passingMark);
    }

    private static int findPassingMark(int[] marks, int x) {
        
        Arrays.sort(marks);
        int passingIndex = marks.length - x;
        
        
        return marks[Math.max(passingIndex - 1, 0)];
    }
}