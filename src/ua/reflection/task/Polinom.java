package ua.reflection.task;

import java.util.Arrays;

/**
 * Created by Denis Starovoitenko on 28.08.2017.
 */
public class Polinom {
    private String[] coefficients;
    private int size;

    public Polinom(int size) {
        this.size = size;
        coefficients = new String[size];
    }

    public String[] getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(String[] coefficients) {
        this.coefficients = coefficients;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void someMethod(String string){
        System.out.println(string + "   " + this.size);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Polinom{");
        sb.append("coefficients=").append(Arrays.toString(coefficients));
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
