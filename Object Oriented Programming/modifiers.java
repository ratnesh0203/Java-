import java.util.Scanner;

class student{
    public String name ;
    private int rollNumber;
    
    public void setRollNumber(int rn){
     rollNumber = rn;
    }
    public int getRollNumber(){
    return rollNumber;
    }

}


public class modifiers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        student s1 = new student();
        s1.name = "Ratnesh";
        s1.setRollNumber(121);
        System.out.println(s1.name);
        System.out.println(s1.getRollNumber());
        s.close();
    }
}
