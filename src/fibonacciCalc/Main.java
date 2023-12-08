package fibonacciCalc;

import java.util.Scanner;

/**
 * <b>Main class of the program for calculating and displaying Fibonacci numbers and their properties.</b>
 * <p>
 * This class contains the main method {@link #main(String[])}, which performs the calculation and
 * display of Fibonacci numbers. The program can accept the value of M as a command-line argument or
 * input it from the keyboard.
 * </p>
 * @author <i>Mykhailo Matsyshyn</i>
 * @version 1.0
 */
public class Main {
    /**
     * The main method of the program that calculates and displays Fibonacci numbers.
     * @param args The array of command-line arguments (the parameter <b><i>M</i></b> can be passed through the command line).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M;

        // Виведення верхньої рамки
        String topBorder = repeatString("=", 40);
        System.out.println(topBorder);

        if (args.length == 1) {
            try {
                M = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Невірний формат номера M.");
                return;
            }

            if (M <= 0) {
                System.out.println("Номер M має бути додатнім числом.");
                return;
            }
        } else {
            System.out.print("Введіть номер M для визначення перших M чисел Фібоначчі: ");
            M = scanner.nextInt();
        }

        // Виведення основного вмісту програми
        FibonacciNumber[] fibonacciNumbers = new FibonacciNumber[M];

        long prev = 0;
        long current = 1;

        for (int i = 0; i < M; i++) {
            fibonacciNumbers[i] = new FibonacciNumber(i + 1, current);
            long next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println("\nПерші " + M + " чисел Фібоначчі та їх властивості:");

        for (FibonacciNumber fibNumber : fibonacciNumbers) {
            System.out.println(fibNumber);
            if (fibNumber.isTriangular()) {
                System.out.println("Це число є трикутним.");
            } else {
                System.out.println("Це число не є трикутним.");
            }
            System.out.println();
        }

        // Виведення нижньої рамки
        System.out.println(topBorder);
    }

    /**
     * Method for repeating a string a specified number of times.
     * @param str The string to be repeated.
     * @param times The number of times to repeat the string.
     * @return A string composed of multiple copies of the input string.
     */
    private static String repeatString(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
