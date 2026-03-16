class Student{
    public int rollno;
    public String name;
    public static String college;

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
        Student s1= new Student();
        s1.rollno= 10;
        s1.name ="Ram";
        s1.college = "ACE";

        Student s2= new Student();
        s2.rollno= 101;
        s2.name ="Shyam";
        s2.college = "JNV";

        s1.read();
        s1.details();

        s2.read();
        s2.details();
    }
}