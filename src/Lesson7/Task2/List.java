package Lesson7.Task2;

public interface List extends Iterable {
    void add(Object value);
    Object get(int idx);
    Object remove(int idx);
}
