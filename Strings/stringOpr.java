import java.util.Scanner;

public class stringOpr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str1 = "Coding";
        String str2 = " is fun ";
        String str3 = "Aoding";
        System.out.println(str1.contains("ias"));

        /*It means the first string will contains the string ias or not. If  yes it will return true and if not it will return false */
        // System.out.println(str1 + str2);
        // str1 = str1 + str2;
        // System.out.println(str1);
        // str1 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3)); 
        /*while using compare if the two strings are same it will give 0 and if not same then it will subtract the ascii value of one from another*/

    }
}
