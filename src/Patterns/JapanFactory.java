package Patterns;

public class JapanFactory extends CarFactory {
    @Override
    public Car createCar() {
   return new Toyota();
    }
}
