package lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Lesson5_run {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox1 = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox2 = new Box<>(new ArrayList<>());

        appleBox.addOne(new Apple());
        appleBox.addOne(new Apple());
        appleBox.addOne(new Apple());

        orangeBox1.addOne(new Orange());
        orangeBox1.addOne(new Orange());
        orangeBox2.addOne(new Orange());
        orangeBox2.addOne(new Orange());

        System.out.println("apple Box Weight: " + appleBox.getWeight());
        System.out.println("orange Box Weight: " + orangeBox1.getWeight());
        System.out.println("apple to orange equals compare:");
        System.out.println(appleBox.compare(orangeBox1));

        orangeBox1.addFrom(orangeBox2);

        System.out.println("apple Box Weight: " + appleBox.getWeight());
        System.out.println("orange Box 1 Weight: " + orangeBox1.getWeight());
        System.out.println("orange Box 2 Weight: " + orangeBox2.getWeight());

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        ArraySwap<String> arr = new ArraySwap<>(list);
        System.out.println(arr.swap(arr.getList(), 0, 2));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        ArraySwap<Integer> arr2 = new ArraySwap<>(list2);

        System.out.println(arr2.swap(arr2.getList(), 0, 2));
    }
}