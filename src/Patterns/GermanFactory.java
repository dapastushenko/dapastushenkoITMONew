package Patterns;

public class GermanFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}

