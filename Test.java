class Student{
    public int rollno;
    public String name;
    public static String college;

    Student(int rollno, String name)
    {
        this.rollno= rollno;
        this.name = name;
        college = "ACE";
    }

    public static void read()
    {
        System.out.println("READ.");
    }

    public void details()
    {
        System.out.println("Roll no : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("College : "+college);
    }
}

public class Test{

    public static void main(String[] args)
    {
        Student s1= new Student(101,"Ram");
       
        Student s2= new Student(102,"Shyam");
       
        s1.read();
        s1.details();

        s2.read();
        s2.details();
    }
}