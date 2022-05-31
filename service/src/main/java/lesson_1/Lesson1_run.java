package lesson_1;

import static lesson_1.Lesson1.*;

public class Lesson1_run {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign(0, -1);
        checkSumSign(-1, 1);
        checkSumSign(-1, 2);

        printColor(-1);
        printColor(0);
        printColor(50);
        printColor(100);
        printColor(101);

        compareNumbers(1, 1);
        compareNumbers(1, 2);
        compareNumbers(-2, -1);
        compareNumbers(22, 11);
    }
}