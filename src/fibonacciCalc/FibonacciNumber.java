package fibonacciCalc;

/**
 * <b>A class representing Fibonacci numbers and their properties.</b>
 * <p>
 * This class contains information about the number and value of a Fibonacci number.
 * It also has a method {@link #isTriangular()} that checks whether the number is triangular.
 * </p>
 * @author <i>Mykhailo Matsyshyn</i>
 * @version 1.0
 */
public class FibonacciNumber {
    private int number; // Номер числа Фібоначчі
    private long value; // Значення числа Фібоначчі

    /**
     * Constructor of the <i>FibonacciNumber</i> class.
     * @param number The number of the Fibonacci number.
     * @param value The value of the Fibonacci number.
     */
    public FibonacciNumber(int number, long value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public long getValue() {
        return value;
    }

    /**
     * Method for checking if the number is a triangular number.
     * @return <b><i>true</i></b> if the number is triangular, <b><i>false</i></b> otherwise.
     */
    public boolean isTriangular() {
        // Перевірка, чи число є трикутним
        long n = value * 2;
        long sqrt = (long) Math.sqrt(n);
        return sqrt * (sqrt + 1) == n;
    }

    /**
     * Overridden method <i>toString()</i> to obtain a string representation of the Fibonacci number.
     * @return A string representation of the Fibonacci number in the format <i>"Fibonacci(N) = V", where N is the number, and V is the value.</i>
     */
    @Override
    public String toString() {
        return "Fibonacci(" + number + ") = " + value;
    }
}
