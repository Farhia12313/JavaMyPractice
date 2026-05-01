public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }

    public static void main(String[] args) {
        Dog d1 = new Dog("Rex", "Labrador");
        Dog d2 = new Dog("Buddy", "Beagle");

        // Modify via setters
        d1.setName("Max");
        d1.setBreed("Golden Retriever");

        d2.setName("Charlie");
        d2.setBreed("Poodle");

        System.out.println("Name: " + d1.getName() + ", Breed: " + d1.getBreed());
        System.out.println("Name: " + d2.getName() + ", Breed: " + d2.getBreed());
    }
}

