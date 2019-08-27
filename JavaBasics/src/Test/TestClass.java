package Test;

public class TestClass implements FirstInterface, SecondInterface {

    @Override
    public void printName() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        TestClass v1 = new TestClass();
        v1.printName();
    }
}
