public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() { return color; }
    public int getDuration() { return duration; }

    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        System.out.println("Color: " + light.getColor() + ", Duration: " + light.getDuration() + "s");
        System.out.println("Is Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());

        light.changeColor("Green", 25);
        System.out.println("Color: " + light.getColor() + ", Duration: " + light.getDuration() + "s");
        System.out.println("Is Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());
    }
}
