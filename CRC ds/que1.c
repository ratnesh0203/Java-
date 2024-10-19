class que1 {
    String text = "Hello, world!";
}

class MySuperclass {
    Message msg = new Message();
}

public class MyClass extends MySuperclass {
    public static void main(String[] args) {
        MyClass object = new MyClass();
        object.print();
    }
    public void print() {
        System.out.println( /* (1) INSERT THE SIMPLEST EXPRESSION HERE */ );
    }
}