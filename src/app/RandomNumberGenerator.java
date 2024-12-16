package app;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min cannot be greater than max");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
