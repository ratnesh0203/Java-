import java.util.*;

public class MUltiDimenson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // System.out.println(arr.length);
          // For Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();

            }
        }
           // For Output
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //       System.out.print(arr[row][col] + " ");

        //     }
        //     System.out.println();
        // }
        // Alternate method to print array
        // for (int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
           // Using Enhanced For loop
           for (int[] a : arr){
            System.out.println(Arrays.toString(a));
           } sc.close();
    }

}
