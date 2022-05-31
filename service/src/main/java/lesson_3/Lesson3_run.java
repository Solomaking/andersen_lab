package lesson_3;

public class Lesson3_run {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            Employee e = new Employee("abra" + i, "cadabra" + i, "jabra" + i, "twer" + i,
                    "asd@a" + i, "+3123" + i, 123 + i, 39 + i);
            employees[i] = e;
            if (e.getAge() > 40) {
                e.tell(e);
            }
        }
    }
}