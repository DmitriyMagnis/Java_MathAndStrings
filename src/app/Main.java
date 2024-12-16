package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        StringManipulator stringManipulator = String::toUpperCase;

        Function<String, Integer> upperCaseCount = StringListProcessor::countUppercase;

        int randomNumber = RandomNumberGenerator.generateRandomNumber(1, 100);

        Supplier<Integer> randNumber = () -> RandomNumberGenerator.generateRandomNumber(1, 100);

        System.out.println("MathOperation: " + math.operate(2,3));
        System.out.println("toUpperCase: " + stringManipulator.toUpperCase("string"));
        System.out.println("countUppercase: " + upperCaseCount.apply("StR"));
        System.out.println("generateRandomNumber: " + randomNumber);
        System.out.println("generateRandomNumber with Supplier: " + randNumber.get());
    }
}
