public class Student
{
    //private fields
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;

    //constructor for student objects
    public Student(String fName, String lName, int grade, int sNum)
    {
        firstName = fName;
        lastName = lName;
        this.grade = grade;
        studentNumber = sNum;
    }

    //to string to allow for printing student objects
    public String toString()
    {
        return "Name: " + firstName + ", " + lastName + " Grade: " + grade;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }

    public void setGrade(int newGrade)
    {
        grade = newGrade;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }
}