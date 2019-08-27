package Lesson16.API;

public class Fish implements CanSwim, CanDive {

    @Override
    public void swim() {
        System.out.println("I am swimming fish");
    }

    public void dive() {
        System.out.println("I am diving fish");
    }
}
