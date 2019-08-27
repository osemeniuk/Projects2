package Lesson16.API;

public class Human implements CanRun, CanDive, CanSwim {
    public void run() {
        System.out.println("Human can run");
    }

    @Override
    public void swim() {
        System.out.println("Human can swim");
    }

    public void dive() {
        System.out.println("Human can dive");
    }

}
