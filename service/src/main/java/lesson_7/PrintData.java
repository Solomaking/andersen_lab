package lesson_7;

import java.util.Arrays;

public class PrintData {
    public static void print(AppData appData) {
        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));
    }
}