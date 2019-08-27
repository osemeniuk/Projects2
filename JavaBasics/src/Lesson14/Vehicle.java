package Lesson14;

import java.util.Objects;

public class Vehicle {

    private String color; // null
    private String brand; // null
    private int numberOfDors; // null

    public Vehicle() {

    }

    public Vehicle(String color, String brand, int numberOfDors) {
        this.color = color;
        this.brand = brand;
        this.numberOfDors = numberOfDors;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfDors() {
        return numberOfDors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfDors == vehicle.numberOfDors &&
                Objects.equals(color, vehicle.color) &&
                Objects.equals(brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, numberOfDors);
    }
}
