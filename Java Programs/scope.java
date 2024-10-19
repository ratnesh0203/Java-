import java.util.Scanner;
public class scope{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int i, ev=0, odd=0;
      while (N >0)
      {
      i = N % 10;
      N= N / 10;
      if(i%2==0)
         ev = ev + i ;
      
      else
        odd = odd + i ;
      
      }
      System.out.println(ev+ " " +odd);
      sc.close();

   }

}
