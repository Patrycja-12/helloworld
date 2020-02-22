package BARNABA;

public interface Stos<T> {

    void add(T el);

    T removeLast();

    boolean isEmpty();

}