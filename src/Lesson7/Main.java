package Lesson7;

public class Main {
    public static void main(String[] args) {
// Создание экземпляра анонимного класса: new Operation {...}
        Accumulator acc = new Accumulator(100, (arg1, arg2) -> Math.abs(arg1) + Math.abs(arg2));
        Accumulator umn =  new Accumulator(13, (arg1, arg2) -> arg1*arg2);

        acc.calculate(-10);
        acc.calculate(23);
        System.out.println(acc.getValue());

        umn.calculate(2);
        umn.calculate(3);
        System.out.println(umn.getValue());
    }
}