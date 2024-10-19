import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Syntax 
   ArrayList<Integer> list = new ArrayList<>(5);
//    list.add(45);
//    list.add(785);
//    list.add(42);
//    list.add(454);
//    list.add(856);
//    System.out.println(list.contains(454));
//    System.out.println(list.set(0, 99));
//    System.out.println(list);
//    list.remove(2);
//    System.out.println(list);
      // FOr Input
      for(int i = 0; i<5; i++){
        list.add(sc.nextInt());
      }

      // Get item at any index
      for(int i=0; i<5; i++){
        System.out.print(list.get(i));
      }
      System.out.println(list);
      sc.close();
   } 
}
