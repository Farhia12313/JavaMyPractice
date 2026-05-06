// Interface definition
interface Drawable {
    void draw(); // Abstract method
}

// Subclass 1: Circle
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle: ( )");
    }
}

// Subclass 2: Rectangle
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle: [ ]");
    }
}

// Subclass 3: Triangle
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle: /_\\");
    }
}

// Main class to run the program
public class d {
    public static void main(String[] args) {
        // You can use the interface type to hold different shape objects
        Drawable myCircle = new Circle();
        Drawable myRect = new Rectangle();
        Drawable myTri = new Triangle();

        // Testing the draw method for each
        myCircle.draw();
        myRect.draw();
        myTri.draw();
    }
}
