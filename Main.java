// Base class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass Bird
class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("The bird chirps: Tweet Tweet!");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating instances of each class
        Animal myAnimal = new Animal();
        Animal myBird = new Bird();
        Animal myCat = new Cat();

        // Calling the sound() method on each object
        System.out.print("Animal: ");
        myAnimal.sound();

        System.out.print("Bird: ");
        myBird.sound();

        System.out.print("Cat: ");
        myCat.sound();
    }
}