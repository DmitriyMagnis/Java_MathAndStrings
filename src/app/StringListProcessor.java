package app;

import java.util.concurrent.atomic.AtomicInteger;

public class StringListProcessor {
    public static int countUppercase(String s) {
        if (s == null || s.isEmpty()) return 0;

        AtomicInteger count = new AtomicInteger(0);

        for (char c: s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count.incrementAndGet();
            }
        }
        return count.get();
    }
}
