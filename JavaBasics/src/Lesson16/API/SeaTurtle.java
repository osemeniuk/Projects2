package Lesson16.API;

public class SeaTurtle implements CanRun, CanDive, CanSwim {
    public void dive(){
        System.out.println("Turtle can dive");
    }

    @Override
    public void swim() {
        System.out.println("Turtle can swim");
    }

    @Override
    public void run() {
        System.out.println("Turtle can run");
    }
}
