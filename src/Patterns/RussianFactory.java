package Patterns;

public class RussianFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Vaz();
    }
}
