package lesson7;

class Accumulator {
    private int value;
    private final Operation operation;

    Accumulator(int value, Operation operation) {
        this.value = value;
        this.operation = operation;
    }

    void calculate(int arg) {
        value = operation.apply(value, arg);
    }

    int getValue() {
        return value;
    }

}
