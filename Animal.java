//Design a Java program to manage different types of vehicles using OOP concepts.

class sound{
    public String name;
    public void makesound(){
        System.out.println("Animal makes a sound ");
    }
}

class Dog extends sound{
    public void makesound()
    {
        System.out.println("Dog Barks ");
    }
}

class Cat extends sound{
    public void makesound()
    {
        System.out.println("Cat Meows ");
    }
}

public class Animal{
    public static void main(String[] args)
    {
        sound s = new sound();
        Dog d = new Dog();
        Cat c = new Cat();
        s.makesound();
        d.makesound();
        c.makesound();
    }
}