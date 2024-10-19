class x {
    int a;
    static int b;

    public static void show() {
        System.out.println("Go to hell");
    }

    public void display() {
        System.out.println("again go to hell");
    }
}
public class program {
    public static void main(String[] args) {
        x.b=54;
        x.show();
        x ob = new x();
        ob.a=23;
        ob.display();
        System.out.println((x.b));
        System.out.println(ob.a);
    }
}
