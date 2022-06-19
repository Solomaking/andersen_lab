package lesson_7;

import lesson_6.MyArraySizeException;

import java.io.IOException;

public class Lesson7_run {
    public static void main(String[] args) throws IOException, MyArraySizeException {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {1, 2, 3},
                {3, 4, 5},
                {1, 4, 3}
        };

        Writer.write(new AppData(header, data));

        {
            try {
                PrintData.print(Reader.reader());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}