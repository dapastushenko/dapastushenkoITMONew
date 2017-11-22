package lesson7.task2;

public interface List extends Iterable {
    void add(Object value);
    Object get(int idx);
    Object remove(int idx);
}
