package lesson_2;

public class ArrayModifier {
    public static int[] arrayModify(int[] intArray) {
        int size = intArray.length;
        int[] modifiedArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (intArray[i] == 0) {
                modifiedArray[i] = 1;
            } else modifiedArray[i] = 0;
        }
        return modifiedArray;
    }
}