package ua.reflection.task;

import java.util.Arrays;

/**
 * Created by Denis Starovoitenko on 28.08.2017.
 */
@Deprecated
public class RationalExpression extends Polinom {
    private int[] numerator;
    private int[] denominator;

    public RationalExpression(int size) {
        super(size);
        numerator = new int[size];
        denominator = new int[size];
    }

    public int[] getNumerator() {
        return numerator;
    }

    public void setNumerator(int[] numerator) {
        this.numerator = numerator;
    }

    public int[] getDenominator() {
        return denominator;
    }

    public void setDenominator(int[] denominator) {
        this.denominator = denominator;
    }

    @MyAnnotation
    public void somemethod1(int number){
        System.out.println("Number:" + number);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RationalExpression{");
        sb.append("numerator=").append(Arrays.toString(numerator));
        sb.append(", denominator=").append(Arrays.toString(denominator));
        sb.append('}');
        return sb.toString();
    }
}
