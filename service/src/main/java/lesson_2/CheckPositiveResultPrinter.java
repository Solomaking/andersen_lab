package lesson_2;

import static lesson_2.PositiveNumberChecker.checkPositive;

public class CheckPositiveResultPrinter {
    public static void print(int number) {
        String result = checkPositive(number) ? (number + " is positive") : (number + " is negative");
        System.out.println(result);
    }
}