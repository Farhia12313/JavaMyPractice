// Interface definition
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing the Resizable interface
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the resizeWidth method
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }

    // Implementing the resizeHeight method
    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }

    public void displayDimensions() {
        System.out.println("Current Dimensions: " + width + "x" + height);
    }
}

// Main class to test the functionality
public class I {
    public static void main(String[] args) {
        // Create a rectangle object
        Rectangle rect = new Rectangle(100, 50);
        rect.displayDimensions();

        // Resize the rectangle
        rect.resizeWidth(150);
        rect.resizeHeight(80);

        // Display updated dimensions
        rect.displayDimensions();
    }
}
