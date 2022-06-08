package lesson_6;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super(String.format("Incorrect value in cell: %dx%d", i, j));
    }
}