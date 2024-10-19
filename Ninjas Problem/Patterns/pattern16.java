import java.util.Scanner;

public class pattern16 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, j;
        for(i=1; i<=N; i++)
		{
			for(j=1; j<=i; j++)
				{
					if(j == 1)
						System.out.println("*");
					
				}
			for(j=i-1; j>=1; j--)
				{		
					System.out.println();
				}
			System.out.print("*");
			System.out.println();
		}

for(i=N-1; i>=1; i--)
	{
		for(j=1; j<=i; j++)
			{
				if(j == 1)
					System.out.print("*");
			
			}
		for(j=i-1; j>=1; j--){
	System.out.print("*");
		}System.out.println();
	}
}
}
