import java.util.Scanner;
public class problem9 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value of 1st number ::");
      int A = sc.nextInt();

      System.out.println("Enter value of 2nd number ::");
      int B = sc.nextInt();

      System.out.println("Select operation");
      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
      char ch = sc.next().charAt(0);
      switch(ch) {
         case 'a':
         System.out.println("Addition is: "+(A+B));
         break;
         case 's' :
         System.out.println("Subtraction is : "+(A-B));
         break;
         case 'm' :
         System.out.println("Multiplication: "+(A*B));
         case 'd' :
         System.out.println("Division is: "+(A/B));
         break;
         default :
         System.out.println("Invalid Option");
      }
      sc.close();
    }  
}    