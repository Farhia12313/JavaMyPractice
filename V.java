// Base class
class Vehicle {
    private int speed;

    public Vehicle() {
        this.speed = 0;
    }

    // Method to be overridden
    public void speedUp() {
        speed += 5;
        System.out.println("Vehicle speed increased to: " + speed + " units.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void speedUp() {
        // Cars accelerate faster
        setSpeed(getSpeed() + 20);
        System.out.println("Car accelerates! New speed: " + getSpeed() + " km/h.");
    }
}

// Subclass Bicycle
class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        // Bicycles accelerate slower
        setSpeed(getSpeed() + 2);
        System.out.println("Bicycle pedaling harder. New speed: " + getSpeed() + " km/h.");
    }
}

public class V {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bicycle();

        // Testing polymorphism
        myCar.speedUp();
        myBike.speedUp();
    }
}