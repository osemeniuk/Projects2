package Lesson25;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2.5, 8000, "comp1");
        Computer comp2 = new Computer(3.8, 16000, "comp2");
        Computer comp3 = new Computer(2.5, 4000, "comp3");
        Computer comp4 = new Computer(2.5, 4000, "comp3");
        Computer comp5 = comp4;

        Set<Computer> computerSet = new LinkedHashSet<>();
        computerSet.add(comp1);
        computerSet.add(comp2);
        computerSet.add(comp3);
        computerSet.add(comp4);

        for (Computer comp : computerSet) {
            System.out.println(comp);
        }

    }
}
