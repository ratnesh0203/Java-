class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound();

        try {
            myAnimal = null;
            throw new NullPointerException("myAnimal is null");
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
