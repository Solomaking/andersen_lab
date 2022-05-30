import lesson_2.ArrayDynamicCreator;
import lesson_2.StringPrinter;

import java.util.Arrays;

import static lesson_2.ArrayCreator.createArray;
import static lesson_2.ArrayModifier.arrayModify;
import static lesson_2.ArrayShifter.shiftArrayValues;
import static lesson_2.ArrayValueMultiplier.multiplyArrayValues;
import static lesson_2.CheckPositiveResultPrinter.print;
import static lesson_2.LeapYearChecker.checkLeap;
import static lesson_2.PositiveNumberChecker.checkPositive;
import static lesson_2.SquareArrayDiagonalFiller.createSquareArray;
import static lesson_2.SquareArrayDiagonalFiller.printSquareArray;
import static lesson_2.SumInRangeChecker.checkSumInRange;

public class Lesson2_run {
    public static void main(String[] args) {
//1
        System.out.println("________________Task_1________________");
        System.out.println("Sum in range " + checkSumInRange(-1, 11));  //true
        System.out.println("Sum in range " + checkSumInRange(-1, 10));  //false
        System.out.println("Sum in range " + checkSumInRange(5, 5));    //true
        System.out.println("Sum in range " + checkSumInRange(5, 15));   //true
        System.out.println("Sum in range " + checkSumInRange(5, 16));   //false
//2
        System.out.println("________________Task_2________________");
        print(1);
        print(-1);
        print(0);
//3
        System.out.println("________________Task_3________________");
        int num1 = -1;
        int num2 = 0;
        int num3 = 1;
        System.out.println(num1 + " negative " + checkPositive(num1));
        System.out.println(num2 + " negative " + checkPositive(num2));
        System.out.println(num3 + " negative " + checkPositive(num3));
//4
        System.out.println("________________Task_4________________");
        StringPrinter.print("same", 1); //same
        StringPrinter.print("some", 0); //nothing
//5
        System.out.println("________________Task_5________________");
        StringPrinter.print("same", 1); //same
        StringPrinter.print("some", 0); //nothing
//6
        System.out.println("________________Task_6________________");
        int year = 123;
        System.out.println(year + " Year is leap " + checkLeap(year));
        year = 120;
        System.out.println(year + " Year is leap " + checkLeap(year));
        year = 100;
        System.out.println(year + " Year is leap " + checkLeap(year));
        year = 400;
        System.out.println(year + " Year is leap " + checkLeap(year));
//7
        System.out.println("________________Task_7________________");
        int[] arrayForChange = new int[]{0, 1, 0, 0, 1, 0, 1};
        int[] resultArray = arrayModify(arrayForChange);

        System.out.println(Arrays.toString(arrayForChange));
        System.out.println(Arrays.toString(resultArray));
//8
        System.out.println("________________Task_8________________");
        System.out.println(Arrays.toString(createArray()));
//9
        System.out.println("________________Task_9________________");
        int[] arrayForMultiplyChange = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] resultMultiplyChange = multiplyArrayValues(arrayForMultiplyChange);

        System.out.println(Arrays.toString(arrayForMultiplyChange));
        System.out.println(Arrays.toString(resultMultiplyChange));
//10
        System.out.println("________________Task_10________________");
        printSquareArray(createSquareArray(5));
        System.out.println("_________________________________");
        printSquareArray(createSquareArray(6));

//11
        System.out.println("________________Task_11________________");
        System.out.println(Arrays.toString(ArrayDynamicCreator.createArray(10, 20)));
//12
        System.out.println("________________Task_12________________");
        int[] createdArray = ArrayDynamicCreator.createArray(10, 20);
        System.out.println(Arrays.toString(createdArray));
        System.out.println("________________________________________");
        System.out.println(Arrays.toString(shiftArrayValues(createdArray, 5)));
    }
}