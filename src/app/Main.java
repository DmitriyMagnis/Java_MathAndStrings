package app;

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        StringManipulator stringManipulator = String::toUpperCase;


        System.out.println("StringManipulator: " + stringManipulator.toUpperCase("string"));
        System.out.println("MathOperation: " + math.operate(2,3));

    }
}
