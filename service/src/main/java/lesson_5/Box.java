package lesson_5;

import java.util.Collections;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public void addOne(T fruit) {
        this.fruits.add(fruit);
    }

    public void addFrom(Box<T> box) {
        List<T> newFruits = box.getFruits();
        this.fruits.addAll(newFruits);
        clearBox(box);
    }

    public double getWeight() {
        try {
            double weight = fruits.get(0).getWeight();
            return fruits.size() * weight;
        } catch (Exception e) {
            System.out.println("Box is empty");
        }
        return 0;
    }

    public boolean compare(Box boxToCompare) {
        return this.getWeight() == boxToCompare.getWeight();
    }

    private List<T> getFruits() {
        return fruits;
    }

    public void clearBox(Box box) {
        box.fruits = Collections.emptyList();
    }
}
