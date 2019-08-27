package Lesson15;

public abstract class MyImplementation implements MyFirstInterface {
    public void sayHelloTo (String s){
        System.out.println("Hello" + s);
    }
    abstract void myMethod();
}
