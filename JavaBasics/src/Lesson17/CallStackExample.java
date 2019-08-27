package Lesson17;

public class CallStackExample {
    public static void main(String[] args) {
//        method1();
        try {
            method1();
        } catch (Exception e) {
            System.out.println("I've got an exception");
        }

        System.out.println("Happy Program");


    }

    public static void method1() {
        method2();

    }

    public static void method2() {
        String s = null;
        s.toString();
    }
}
