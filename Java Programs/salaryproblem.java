import java.util.Scanner;
import java.lang.Math;
public class salaryproblem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int basic = sc.nextInt();
		String str = sc.next();
		char c = str.charAt(0);
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
	    double totalSalary =((basic + (0.2*basic)+(0.5*basic)+ allow) - (0.11*basic));
		double p = Math.round(totalSalary);
        int h = (int)(p);
		System.out.println(h);
		sc.close();
	   

	}
}
