
    import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        // System.out.println("Enter a binary number:");
        int binaryNumber = scanner.nextInt();

        
        int decimalNumber = binaryToDecima(binaryNumber);

        
        System.out.println(decimalNumber);

        scanner.close();
    }

    public static int binaryToDecima(int binary) {
        int decimal = 0;
        int base = 1; 
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            binary /= 10; 
            base *= 2; 
        }
        return decimal;
    }
}


