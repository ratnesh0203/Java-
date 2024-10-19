class Vehicle{
   int maxSpeed = 120;
}

class Car extends Vehicle{
    int maxSpeed = 180;
    void print (){
        System.out.println("Maximum Speed:" +super.maxSpeed );
    }
    public static void main(String[] args) {
       Car c1 = new Car();
       c1.print();
    }
}