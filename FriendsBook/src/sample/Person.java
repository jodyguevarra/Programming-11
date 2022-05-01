package sample;

public class Person {
    public String name;
    public int age;
    public String insta;

    Person(String n , int a, String i){
        name = n;
        age = a;
        insta = i;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getInsta()
    {
        return insta;
    }

    public String toString()
    {
        return name;
    }
}
