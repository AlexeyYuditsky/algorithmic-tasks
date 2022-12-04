package test;

import org.jetbrains.annotations.NotNull;

public class Car {
    String color;

    private Car(String color) {
        this.color = color;
    }

    @NotNull
    public static Car getCar(String color) {
        if (color == null) {
            return null;
        } else {
            return new Car(color);
        }
    }

    @Override
    public String toString() {
        return "test.Car, hashcode: " + this.hashCode() + ", color: " + this.color;
    }

}
