package lesson_6;

public class Lesson6_run {
    public static void main(String[] args) throws Exception {
        Summator summator = new Summator();
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect3 = {
                {"1", "asd", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println("Sum is " + summator.sum(correct));
            System.out.println("Sum is " + summator.sum(incorrect1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Sum is " + summator.sum(incorrect2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Sum is " + summator.sum(incorrect3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}