import java.util.Scanner;

public class fahToCelcius {
    public static void printFahrenheitToCelsius(int start, int end, int step){
        while(start<=end)
        {
         
            int fah=((5*(start-32))/9);
             System.out.println(start+" "+fah);
            start+=step;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
    }
}
