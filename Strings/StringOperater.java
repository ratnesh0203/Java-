import java.util.ArrayList;

public class StringOperater {
    public static void main(String[] args) {
        System.out.println('a' + 'b');// o/p 195
        System.out.println("a" + "b");// o/p ab
        System.out.println((char) ('a' + 3)); // o/p d
        System.out.println("a" + 1);// output is a1
        // this is same as after a few steps: "a" + "1"
        // when an integer is added with a string it is converted to its rapper class
        // Integer that will call toString().
        System.out.println("Ratnesh" + new ArrayList<>()); // o/p Ratnesh[]

    }
}
