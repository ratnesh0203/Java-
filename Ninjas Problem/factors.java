import java.util.Scanner;
public class factors{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int i;
      for (i=2;i<n;++i)
      if(n%i==0   ){
          System.out.println(i+ " ");
          sc.close();
      } if (n%1==0 && n%n==0){
        System.out.println("");
        
      }
          
      }
    }
