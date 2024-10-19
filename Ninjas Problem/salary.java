import java.util.Scanner;
public class salary {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int basic = sc.nextInt();
		String str = sc.next();
		char c = str.charAt(0);
		// // char A,B,C;
		// double hra = 0.2 * basic;
		// double da= 0.5 * basic;
		// double pf = 0.11 * basic;
		int allow = 0;
		if (c==65)
		{
			allow = 1700;
		}
		else if (c==66)
		{
			allow = 1500;
		}
		else if (c==67)
		{
			allow = 1300;
		}
		// double totalSalary = basic + hra +da + allow - pf;
	   double totalSalary = ((basic + (0.2*basic)+(0.5*basic)+allow) - (0.11*basic));
		double p = Math.round(totalSalary);
        int h = (int)(p);
		System.out.println(h);
		sc.close();
	   

	}
}
