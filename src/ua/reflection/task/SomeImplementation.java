package ua.reflection.task;

/**
 * Created by Denis Starovoitenko on 29.08.2017.
 */
public class SomeImplementation implements SomeInterface<String> {
    private String string;

    public SomeImplementation(String string) {
        this.string = string;
    }

    @Override
    public String get() {
        return string;
    }

    @Override
    public void set(String object) {
        this.string = object;
    }
}
