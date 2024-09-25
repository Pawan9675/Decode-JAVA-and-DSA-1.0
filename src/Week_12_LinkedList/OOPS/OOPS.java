/*
Objects: Objects represent real-life entities with properties and behaviors.
Classes: Classes are blueprints for creating objects.
*/

package Week_12_LinkedList.OOPS;

// Main class demonstrating Object-Oriented Programming concepts
public class OOPS {

    // Inner class Student representing a student entity with attributes and behaviors
    public static class Student {
        String name;               // Name of the student
        int rno;                   // Roll number of the student
        double percent;            // Percentage scored by the student
        private double marks;      // Marks scored by the student (Private access, accessed via getter/setter)
        final String schoolName = "VIT Vellore"; // Final variable for the school name (can't be modified)
        static int numberOfStudents; // Static variable to keep track of total students (shared across all instances)

        // Default Constructor: Initializes an object and increments the student count
        public Student() {
            numberOfStudents++;  // Increment the student count when a new object is created
        }

        // Parameterized Constructor: Initializes an object with specific values for name, roll number, percent, and marks
        public Student(String name, int rno, double percent, double marks) {
            this.name = name;               // Assigning the name
            this.rno = rno;                 // Assigning the roll number
            this.percent = percent;         // Assigning the percentage
            this.marks = marks;             // Assigning the marks (private variable)
            numberOfStudents++;             // Increment the student count
        }

        // Getter method for the private variable 'marks'
        public double getMarks() {
            return marks; // Returns the marks of the student
        }

        // Setter method to update the private variable 'marks'
        public void setMarks(double marks) {
            this.marks = marks; // Sets the marks of the student
        }
    }

    // Static method to change the name of a student object
    // Demonstrates pass-by-reference for objects (changes persist)
    public static void change(Student student) {
        student.name = "Rohan"; // Modifies the 'name' property of the passed object
    }

    public static void main(String[] args) {

        // Print the number of students before any objects are created (should be 0)
        System.out.println(Student.numberOfStudents);

        // Creating first student object using parameterized constructor
        Student student1 = new Student("Alan", 76, 91.6, 90);

        // Displaying details of student1
        System.out.println("Name of student 1: " + student1.name);
        System.out.println("Roll no. of student 1: " + student1.rno);
        System.out.println("Percentage of student 1: " + student1.percent);
        System.out.println("School name of student 1: " + student1.schoolName);
        System.out.println("Total number of students: " + student1.numberOfStudents);

        // Creating second student object using parameterized constructor
        Student student2 = new Student("Wake", 62, 91.8, 91);

        // Displaying details of student2
        System.out.println("Name of student 2: " + student2.name);
        System.out.println("Roll no. of student 2: " + student2.rno);
        System.out.println("Percentage of student 2: " + student2.percent);
        System.out.println("School name of student 2: " + student2.schoolName);
        System.out.println("Total number of students: " + student2.numberOfStudents);

        // Updating the name of student1 directly
        student1.name = "Raman";
        System.out.println("Updated name of student 1: " + student1.name);

        // Changing student1 name using the 'change' method (demonstrates pass-by-reference)
        change(student1);
        System.out.println("Updated name of student 1 (after change method): " + student1.name);

        // Note: If we want to use a class from another package, we must import it

        // Creating an instance of College (from another class in the same package)
        College c1 = new College();
        c1.name = "VIT";            // Setting the college name
        c1.location = "Chennai";     // Setting the college location

        // Displaying details of the college
        System.out.println("Name of the college: " + c1.name);
        System.out.println("Location of the college: " + c1.location);

        // Creating third-student using the default constructor
        Student student3 = new Student();

        // Displaying details of student3 (default values)
        System.out.println("Name of student 3: " + student3.name);        // Default value (null)
        System.out.println("Roll no. of student 3: " + student3.rno);     // Default value (0)
        System.out.println("Percentage of student 3: " + student3.percent); // Default value (0.0)
        System.out.println("School name of student 3: " + student3.schoolName); // Final variable (fixed)
        System.out.println("Total number of students: " + student3.numberOfStudents);

        // Using setter methods to set marks for student1 and student2
        student1.setMarks(90);
        student2.setMarks(91);

        // Displaying marks using the getter method
        System.out.println("Marks of student 1: " + student1.getMarks());
        System.out.println("Marks of student 2: " + student2.getMarks());
        System.out.println("Marks of student 3: " + student3.getMarks()); // Default value (0.0)

        /*
        Static Method Explanation:
        Static methods belong to the class itself, not to an instance. They can be accessed using ClassName.methodName
        and do not require an object to be called.
        */
    }
}
