package ua.reflection.task;

/**
 * Created by Denis Starovoitenko on 29.08.2017.
 */
public interface SomeInterface<T> {
    T get();
    void set(T object);
}
