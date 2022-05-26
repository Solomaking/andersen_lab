package lesson_1;

public class Lesson1 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        String answer = (sum < 0) ? "Сумма отрицательная" : "Сумма положительная";
        System.out.println(answer);
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный " + value);
        } else if (value <= 100) {
            System.out.println("Желтый " + value);
        } else System.out.println("Зеленый " + value);
    }

    public static void compareNumbers(int a, int b) {
        String answer = (a >= b) ? (a + " >= " + b) : (a + " < " + b);
        System.out.println(answer);
    }
}