package lesson_2;

public class ArrayCreator {
    public static int[] createArray() {
        int size = 100;
        int[] cratedArray = new int[size];
        for (int i = 0; i < size; i++) {
            cratedArray[i] = i + 1;
        }
        return cratedArray;
    }
}