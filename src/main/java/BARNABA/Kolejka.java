package BARNABA;

public interface Kolejka<T> {

    void addLast(T el);

    T removeFirst();

    boolean isEmpty();

}