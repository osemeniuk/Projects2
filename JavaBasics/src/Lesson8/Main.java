package Lesson8;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.age = 20;
        p.address = new Address();
        boolean b = p.isTeenager();

        Person p2 = new Person();
        p2.name = "Alice";
        p2.age = 18;
        p2.address = new Address();
        boolean b2 = p2.isTeenager();

        String name = "John";
        String sername = new String("Smith");
        char[] surname2 = "Smith".toCharArray();
        char[] name2 = name.toCharArray();
        System.out.println(surname2);
        System.out.println(name2);

    }
}
