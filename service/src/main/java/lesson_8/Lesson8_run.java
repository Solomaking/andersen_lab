package lesson_8;

import java.util.ArrayList;

public class Lesson8_run {
    public static void main(String[] args) {
        String[] arr = {
                "Value 1", "Unique 1", "Value 3",
                "Value 1", "Value 2", "Value 3",
                "Value 1", "Unique 2", "Value 3",
                "Value 1", "Value 2", "Value 3",
                "Value 1", "Value 2", "Unique 3"
        };
        DuplicatesChecker.printUniqueRecords(arr);
        DuplicatesChecker.printRecordsAmount(arr);

        System.out.println("________________________________");
        Phonebook phonebook = new Phonebook(new ArrayList<>());

        phonebook.addRecord("Test1", "+12314");
        phonebook.addRecord("Test1", "+22314");
        phonebook.addRecord("Test2", "+32314");

        phonebook.getRecord("Test1");
    }
}