package lesson_4;

import java.util.concurrent.atomic.AtomicInteger;

public class Dog extends Animal {
    private static final AtomicInteger counter = new AtomicInteger(1);
    private static int dogCount;

    public Dog(String name) {
        super(name, 500, 10, true, true);
        dogCount = counter.getAndIncrement();
    }

    public static int getDogCount() {
        return dogCount;
    }
}