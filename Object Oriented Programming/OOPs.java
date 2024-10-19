class Student {
    String name;
    int age;

Student(){
    // System.out.println("Constructor Created");
}    

Student (String name, int age){
    this.name = name;
    this.age = age;

}
Student (Student s2){
    this.name = s2.name;
    this.age = s2.age;

}
public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
}

public class OOPs {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Ratnesh";
       s1.age = 22;
       Student s2 = new Student(s1);
       s2.printInfo();
    }
}
