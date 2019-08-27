package Lesson25;

import java.util.Objects;

public class Computer {
    private double CPU;
    private int RAM;
    private String name;

    public Computer(double CPU, int RAM, String name) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU=" + CPU +
                ", RAM=" + RAM +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Computer computer = (Computer) o;
//        return Double.compare(computer.CPU, CPU) == 0 &&
//                RAM == computer.RAM &&
//                Objects.equals(name, computer.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(CPU, RAM, name);
//    }
}
