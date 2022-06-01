package lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        if (this.food >= n) {
            food -= n;
        } else System.out.println("Not enough food in the plate");
    }

    public void increaseFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("Food in plate: " + food);
    }
}