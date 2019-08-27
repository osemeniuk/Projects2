package Lesson16.API;

public class Main {
    public static void main(String[] args) {
        CanSwim[] swimmingAnimals = new CanSwim[3];
        swimmingAnimals[0]= new Fish();
        swimmingAnimals[1]= new FlyingFish();
        swimmingAnimals[2]= new Human();

        CanRun[] runningAnimals = new CanRun[2];
        runningAnimals[0] = new Human();
        runningAnimals[1] = new SeaTurtle();

        CanDive[] divingAnimals = new CanDive[4];
        divingAnimals[0] = new SeaTurtle();
        divingAnimals[1] = new Fish();
        divingAnimals[2] = new FlyingFish();
        divingAnimals[3] = new Human();

        CanFlight[] flyingAnimals = new CanFlight[1];
        flyingAnimals[0]= new FlyingFish();

        swim(swimmingAnimals);
        run(runningAnimals);
        dive(divingAnimals);
        flight(flyingAnimals);

    }

    static void swim(CanSwim[] animals) {
        for (CanSwim animal : animals) {
            animal.swim();

        }
    }

    static void run(CanRun[] animals) {
        for (CanRun animal : animals) {
            animal.run();

        }
    }

    static void dive(CanDive[] animals) {
        for (CanDive animal : animals) {
            animal.dive();

        }
    }

    static void flight(CanFlight[] animals) {
        for (CanFlight animal : animals) {
            animal.flight();

        }
    }
}
