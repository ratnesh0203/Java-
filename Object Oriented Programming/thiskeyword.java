import java.util.Scanner;

class students{
    String name;
    int rollNumber;

    public students (String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void print(){
        System.out.println(name + " " + rollNumber);
    }
}


public class thiskeyword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        students s1 = new students("Ratnesh", 123);
        s1.print();
        s.close();
    }
}
