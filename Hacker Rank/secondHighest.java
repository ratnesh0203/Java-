import java.util.Scanner;

public class secondHighest {
    public static int getSecondLargest(int a[], int high){
        int temp;
        for(int i = 0; i < high; i++){
            for(int j = i+1; j < high; j++ ){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[high - (2)];
     }
     
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N[] = new int[3];
        int result = getSecondLargest(N, 0);
        System.out.println(result);
s.close();
    } 
}
