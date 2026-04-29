public class Student {

    // data members of the class
    String name;
    int id;

    // Parameterized Constructor
Student (String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Method to display object data
    void display(){
        
        System.out.println("Student Name: " + name
                           + "\n and Student Id: " + id);
    }

    // main() method — placed inside the same class for
    // universal compatibility
    public static void main(String[] args){
        
        // This will invoke the parameterized constructor
        Student s1 = new Student ("Sabiha Farhia Talukder", 24010124);
        s1.display();
    }
}

    

