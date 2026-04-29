public class StudentC {
    
    // data members of the class
    String name;
    int id;

    // Parameterized Constructor
    StudentC(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    StudentC(StudentC obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

class CopyStudent {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor
        System.out.println("First Object");
        StudentC s1 = new StudentC("Sabiha Farhia", 64);
        System.out.println("StudentName: " + s1.name
                           + " and StudentId: " + s1.id);

        System.out.println();

        // This would invoke the copy constructor
        StudentC s2 = new StudentC(s1);
        System.out.println(
            "Copy Constructor used Second Object");
        System.out.println("StudentName: " +  s2.name
                           + " and StudentId: " + s2.id);
    }
}
    
