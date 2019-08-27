package Lesson17;

public class CallStackPlay {

    public static void main(String[] args) {
        try {
            faultyMethod();
        } catch (Exception e){
            System.out.println("exception in main method!!!");

        }
        System.out.println("test2");
    }

    static void faultyMethod() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("exception in faulty method");
        }
    }

    static void method2() {
        throw new NullPointerException();
    }
}
