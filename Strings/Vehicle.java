class vehicleUse{
    String brand = "Ford";
    public void honk(){
        System.out.println("tuut tuut ");
    }
}
class Car extends vehicleUse{
    String modelName = "Mustang";
}
public class Vehicle {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.honk();
    System.out.println(myCar.brand + " " + myCar.modelName); 
  }
}
