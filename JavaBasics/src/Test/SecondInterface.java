package Test;

public interface SecondInterface {
    default void printName() {
        System.out.println("Printing 2d element");
    }
}
