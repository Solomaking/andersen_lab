package lesson_8;

import java.util.List;

public class Phonebook {

    private List<Record> records;

    public Phonebook(List<Record> records) {
        this.records = records;
    }

    public void addRecord(String surname, String phoneNumber) {
        this.records.add(new Record(surname, phoneNumber));
    }

    public void getRecord(String surname) {
        System.out.println("Surname: " + surname);
        System.out.println("Phone numbers: ");
        records.stream()
                .filter(entity -> entity.getSurname().equals(surname))
                .map(Record::getPhoneNumber)
                .forEach(System.out::println);
    }

    private static class Record {
        String surname;
        String phoneNumber;

        public String getSurname() {
            return surname;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        private Record(String surname, String phoneNumber) {
            this.surname = surname;
            this.phoneNumber = phoneNumber;
        }
    }
}