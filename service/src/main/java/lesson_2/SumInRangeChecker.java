package lesson_2;

public class SumInRangeChecker {
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }
}
