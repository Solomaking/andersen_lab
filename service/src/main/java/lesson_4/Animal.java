package lesson_4;


import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.String.format;

public abstract class Animal {
    private static final AtomicInteger counter = new AtomicInteger(1);
    private static int animalCount;

    String name;

    int lengthRunLimit;
    int lengthSwimLimit;
    boolean canRun;
    boolean canSwim;

    public Animal(String name, int lengthRunLimit, int lengthSwimLimit, boolean canRun, boolean canSwim) {
        this.name = name;
        this.lengthRunLimit = lengthRunLimit;
        this.lengthSwimLimit = lengthSwimLimit;
        this.canRun = canRun;
        this.canSwim = canSwim;

        animalCount = counter.getAndIncrement();
    }

    public String getName() {
        return name;
    }

    public int getLengthRunLimit() {
        return lengthRunLimit;
    }

    public int getLengthSwimLimit() {
        return lengthSwimLimit;
    }

    public boolean isCanRun() {
        return canRun;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void run(int length, Animal animal) {
        String name = animal.getName();
        boolean canSwim = animal.isCanRun();
        String animalClass = animal.getClass().getSimpleName();
        String result = canSwim ? (format("%s run %d meters.", name, length)) :
                (format("%s cant run. It has class %s", name, animalClass));

        int limitation = animal.getLengthRunLimit();
        if (length <= limitation || !isCanRun()) {
            System.out.println(result);
        } else System.out.println(format("%s of class %s has run limitation %d", name, animalClass, limitation));
    }

    public void swim(int length, Animal animal) {
        String name = animal.getName();
        boolean canSwim = animal.isCanSwim();
        String animalClass = animal.getClass().getSimpleName();
        String result = canSwim ? (format("%s swim %d meters.", name, length)) :
                (format("%s cant swim. It has class %s", name, animalClass));

        int limitation = animal.getLengthSwimLimit();
        if (length <= limitation || !isCanSwim()) {
            System.out.println(result);
        } else System.out.println(format("%s of class %s has swim limitation %d", name, animalClass, limitation));
    }

    public static int getCount() {
        return animalCount;
    }
}
