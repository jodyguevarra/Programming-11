import java.util.ArrayList;
public class School
{
    //private fields to use when creating object
    private String name;
    private int yearBuilt;
    private int numberOfStudents;

    //Creating ArrayLists for storing students and teachers
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();

    //Constructor for School object
    public School (String theName, int theYear, int theStudents)
    {
        name = theName;
        yearBuilt = theYear;
        numberOfStudents = theStudents;
    }
    public String getName()
    {
        return name;
    }
    public int getYearBuilt()
    {
        return yearBuilt;
    }
    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public void setYearBuilt(int newYearBuilt)
    {
        yearBuilt = newYearBuilt;
    }
    public void setNumberOfStudents(int newNumberOfStudents)
    {
        numberOfStudents = newNumberOfStudents;
    }
    //Method to add a teacher to teacher ArrayList
    static void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }
    //Method to add a student to student ArrayList
    static void addStudent(Student student)
    {
        students.add(student);
    }
    //Method to remove a student from student ArrayList
    static void removeStudent(Student student)
    {
        students.remove(student);
    }
    //Method to remove a teacher from teacher ArrayList
    static void removeTeacher(Teacher teacher)
    {
        teachers.remove(teacher);
    }
    //Method to printout teacher list
    public static String showTeachers()
    {
        //String to keep track of our list, which we return at the end
        String names = "";
        //For loop to iterate through every object in ArrayList
        for(Teacher name: teachers)
        {
            //Adding the names of Teachers to our list of teachers to print
            names+= name.getFirstName() + ", " + name.getLastName() + "\n";

        }
        //Returning teacher list
        return "Teacher List:\n" + names;
    }
    //same method with different variables
    public static String showStudents()
    {
        String names = "";
        for(Student name: students)
        {
            names += name.getFirstName() + ", " + name.getLastName() + "\n";

        }
        return "Student List:\n" + names;
    }

}

