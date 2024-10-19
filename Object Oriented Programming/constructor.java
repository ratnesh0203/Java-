import java.util.Scanner;

class students {
    public String name;
    private int rollNumber;

    public students(String n, int rn) {
        name = n;
        rollNumber = rn;
    }

    public void setRollNumber(int rn) {
        rollNumber = rn;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void print() {
        System.out.println(name + " : " + rollNumber);
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        students s1 = new students("Ratnesh", 123);
        // System.out.println(s1.name);
        // System.out.println(s1.rollNumber);
        s1.print();
        s.close();
    }
}
