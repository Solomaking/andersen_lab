package lesson_2;

public class ArrayValueMultiplier {
    public static int[] multiplyArrayValues(int[] intArray) {
        int size = intArray.length;
        int[] modifiedArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (intArray[i] < 6) {
                modifiedArray[i] = intArray[i] * 2;
            } else modifiedArray[i] = intArray[i];
        }
        return modifiedArray;
    }
}
