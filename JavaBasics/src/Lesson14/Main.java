package Lesson14;

public class Main {

    public static void main(String[] args) {
        Parent p = new Parent();
        callDoStuff(p);
        Parent c = new Child();
        callDoStuff(c);
        Child c2 = (Child)c;
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle("White", "BMW", 4);
        Vehicle v2 = new Vehicle("Black", "Kia", 3);
        Vehicle v3 = new Vehicle("White", "BMW", 4);
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));
    }

    static void callDoStuff (Parent p) {
        p.doStuff();
    }


}
