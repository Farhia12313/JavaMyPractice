public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);

        System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());
        System.out.println("Name: " + p2.getName() + ", Age: " + p2.getAge());
    }
}
