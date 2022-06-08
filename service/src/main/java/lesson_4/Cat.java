package lesson_4;

import java.util.concurrent.atomic.AtomicInteger;

public class Cat extends Animal implements PlateInteraction {
    private static final AtomicInteger counter = new AtomicInteger(1);
    private static int catCount;
    private boolean fed;
    private int appetite;

    public Cat(String name, int appetite) {
        super(name, 200, 0, true, false);
        this.fed = false;
        this.appetite = appetite;
        catCount = counter.getAndIncrement();
    }

    @Override
    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            plate.decreaseFood(appetite);
            this.fed = true;
        }
    }

    public boolean isFed() {
        return fed;
    }

    public int getAppetite() {
        return appetite;
    }

    public static int getCatCount() {
        return catCount;
    }
}