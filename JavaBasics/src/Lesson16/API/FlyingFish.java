package Lesson16.API;

public class FlyingFish extends Fish implements CanFlight {
    @Override
    public void flight() {
        System.out.println("I am flying fish, I can Fly");
    }

    @Override
    public void swim() {
//      super.swim();
        System.out.println("I am flying fish, I can swim");
    }

    public void dive() {
        System.out.println("I am flying fish, I can dive");

    }
}
