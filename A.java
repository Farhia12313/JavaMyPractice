// Interface definition
interface Animal {
    // Abstract method (no body)
    void bark();
}

// Dog class implementing the Animal interface
class Dog implements Animal {
    // Overriding the bark() method from the interface
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to run the program
public class A{
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog();
        
        // Calling the bark method
        myDog.bark();
    }
}
