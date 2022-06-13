package lesson_7;

import lesson_6.MyArraySizeException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Writer {
    public static void write(AppData appData) throws MyArraySizeException, IOException {
        String[] header = appData.getHeader();
        int[][] data = appData.getData();
        int headerLength = header.length;

        Path local = Paths.get("service\\/src\\/main\\/resources\\/arr.csv");
        BufferedWriter bufferedWriter = Files.newBufferedWriter(local, StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.CREATE);

        bufferedWriter.write(convertHeaderToCSV(header));

        for (int i = 0; i < data.length; i++) {
            if (data[i].length != headerLength) {
                throw new MyArraySizeException(String.format("Incorrect amount of columns in row %d", i + 1));
            }
            String values = convertValuesToCSV(data[i]);
            bufferedWriter.newLine();
            bufferedWriter.write(values);
        }
        bufferedWriter.close();
    }

    private static String convertHeaderToCSV(String[] data) {
        return String.join(";", data);
    }

    private static String convertValuesToCSV(int[] data) {
        return Arrays.stream(data)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(";"));
    }
}
