import java.util.Scanner;
public class pattern11 {


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    int i ,j;
	for (i=0;i<=N;i++){
		for(j=0;j<=N;j++){
        if (j>=1 && j<=i){
            System.out.print("*");
        }else {
            System.out.print("");
        }
		}System.out.println();
	}sc.close();
	

		
	}

}
