package lesson_2;

public class ArrayDynamicCreator {
    public static int[] createArray(int length, int initialValue) {
        int[] createdArray = new int[length];
        for (int i = 0; i < length; i++) {
            createdArray[i] = initialValue;
            initialValue = initialValue + 1;
        }
        return createdArray;
    }
}