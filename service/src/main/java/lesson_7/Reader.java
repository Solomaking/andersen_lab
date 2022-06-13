package lesson_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Reader {
    public static AppData reader() throws IOException {
        String[] header;

        Path local = Paths.get("service\\/src\\/main\\/resources\\/arr.csv");
        BufferedReader bufferedReader = Files.newBufferedReader(local);
        header = bufferedReader.readLine().split(";");
        int length = header.length;
        String intLine;
        int i = 0;
        int[][] data = new int[length][];

        while ((intLine = bufferedReader.readLine()) != null) {
            data[i] = Arrays.stream(intLine.split(";")).map(String::trim).mapToInt(Integer::parseInt).toArray();
            i++;
        }

        return new AppData(header, data);
    }
}
