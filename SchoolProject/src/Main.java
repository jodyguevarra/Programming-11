public class Main {
    public static void main(String[] args)
    {
        Student charles = new Student("Charles", "Chaplain", 12, 1);
        Student stephanie = new Student("Stephanie", "Hill", 12, 2);
        Student lauren = new Student("Lauren", "Valdez", 12, 3);
        Student juan = new Student("Juan", "dos Santos", 12, 4);
        Student philip = new Student("Philip", "Wallsmith", 12, 5);
        Student tobias = new Student("Tobias", "Watchmaker", 12, 6);
        Student charlize = new Student("Charlize", "Theron", 12, 7);
        Student luna = new Student("Luna", "Lunali", 12, 8);
        Student clarence = new Student("Clarence", "Valing", 12, 9);
        Student emily = new Student("Emily", "Walker", 12, 10);
        School.addStudent(charles);
        School.addStudent(stephanie);
        School.addStudent(lauren);
        School.addStudent(juan);
        School.addStudent(philip);
        School.addStudent(tobias);
        School.addStudent(charlize);
        School.addStudent(luna);
        School.addStudent(clarence);
        School.addStudent(emily);
        Teacher andrei = new Teacher("Andrei", "Florut", "Mathematics");
        Teacher kevin = new Teacher ("Kevin", "Yang", "Biology");
        Teacher gabriela = new Teacher ("Gabriela", "Contu", "French");
        School.addTeacher(andrei);
        School.addTeacher(kevin);
        School.addTeacher(gabriela);
        System.out.println(School.showStudents());
        System.out.println(School.showTeachers());
        School.removeStudent(charles);
        School.removeStudent(emily);
        School.removeTeacher(andrei);
        System.out.println(School.showStudents());
        System.out.println(School.showTeachers());
    }
}
