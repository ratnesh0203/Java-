import java.util.Scanner;

class student {
    String name;
    int RollNo;
}


public class students {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        student s1 = new student();
        student s2 = new student();
        s1.name = "Ratnesh Mishra";
        s1.RollNo = 22;
        s2.name = "Aradhya Mishra";
        s2.RollNo = 21;
        System.out.println(s1.name + " " + s1.RollNo);
        System.out.println(s2.name + " " + s2.RollNo);
        s.close();
    }
}
