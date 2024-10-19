import java.util.Scanner;

public class binarySearch {
    public static int binarysearch(int arr[], int ele){
     int start = 0;
     int end = arr.length - 1;
     while (start<=end){
        int mid = (start + end) / 2;
        if(ele == arr[mid]){
         return mid;
        }
        else if (ele < arr[mid]){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
     }
     return -1;
   
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        int ele = s.nextInt();
        binarysearch(arr, ele);
        int index = binarysearch(arr, ele);
        System.out.println(index);

s.close();

        
    }
}
