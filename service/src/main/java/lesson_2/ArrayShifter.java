package lesson_2;

public class ArrayShifter {
    public static int[] shiftArrayValues(int[] intArray, int n) {
        int size = intArray.length;
        for (int a = 0; a < n; a++) {
            int index = 0;
            int newIndex;
            int temp1 = intArray[0];
            int temp2;
            for (int i = 0; i < size; i++) {
                newIndex = getNewIndex(index, size, 1);
                temp2 = intArray[newIndex];
                intArray[newIndex] = temp1;
                temp1 = temp2;
                index = newIndex;
            }
        }
        return intArray;
    }

    private static int getNewIndex(int index, int size, int step) {
        int newIndex;
        if (index + step < size) {
            newIndex = index + step;
        } else newIndex = index + step - size;
        return newIndex;
    }
}