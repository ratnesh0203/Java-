import java.util.Scanner;
public class SumofNnumbers
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int i=0 ,sum=0;
      while (i<=N)
      {
      if (i%2==0)
       sum = sum + i ;
       i++;
       }
       System.out.println(sum);
       sc.close();
   }
}
      
   