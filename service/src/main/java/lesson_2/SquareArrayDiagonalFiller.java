package lesson_2;

public class SquareArrayDiagonalFiller {
    public static int[][] createSquareArray(int length) {
        int[][] createdArray = new int[length][length];
        int counter = length - 1;
        for (int i = 0; i < length; i++) {
            createdArray[i][i] = 1;
            createdArray[i][counter] = 1;
            counter--;
        }
        return createdArray;
    }

    public static void printSquareArray(int[][] arrayForPrint) {
        int size = arrayForPrint.length;
        for (int a = 0; a < size; a++) {
            for (int i = 0; i < size; i++) {
                System.out.print(arrayForPrint[a][i] + " ");
            }
            System.out.println();
        }
    }
}
