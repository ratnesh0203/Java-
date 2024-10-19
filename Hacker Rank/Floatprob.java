import java.text.DecimalFormat;
import java.util.Scanner;

class Floatprob{
       static float printInFormat(float a, float b){
        float result = a/b;
       System.out.printf("%.3f %.3f", result,result);
    return result;
        
        // Your code here to print upto 3 decimal places
        
    }    
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float ans = printInFormat(a, b);
        System.out.format(.3f, args)
        s.close();
    } 
    
}