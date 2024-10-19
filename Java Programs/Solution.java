import java.util.Scanner;

public class Solution {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int i , s1=0, s2=0;
      // int s1 = 0;
      // int s2 = 0;
      while (N>0) {
       i = N % 10;
       N = N/10;
       if (i%2==0){
         s1 = s1 + i;
       } 
       else{
         s2 = s2 + i;
       }i++;
      }System.out.println(s1+" "+s2);
      sc.close();
   }
}
