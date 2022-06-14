package lesson_8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesChecker {
    public static void printUniqueRecords(String[] arr) {
        System.out.println("Unique records are:");
        Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity()))
                .forEach((key, value) -> {
                    if (value.size() == 1) System.out.println(key);
                });
    }

    public static void printRecordsAmount(String[] arr) {
        Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity()))
                .forEach((key, value) ->
                        System.out.println(key + " record occurs " + value.size() + " time(s)")
                );
    }
}