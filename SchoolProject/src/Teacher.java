public class Teacher
{
    //private fields
    private String firstName;
    private String lastName;
    private String subject;

    //constructor for teacher object
    public Teacher(String fName, String lName, String sub)
    {
        firstName = fName;
        lastName = lName;
        subject = sub;
    }

    // to string method to allow use to print out a teacher object
    public String toString()
    {
        return "Name: " + firstName + ", " + lastName + " Subject: " + subject;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }

    public void setSubject(String newSubject)
    {
        subject = newSubject;
    }

}