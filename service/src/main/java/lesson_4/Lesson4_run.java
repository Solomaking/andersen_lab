package lesson_4;

import static java.lang.String.format;

public class Lesson4_run {
    public static void main(String[] args) {
        Cat cat = new Cat("Murcat", 5);
        cat.run(150, cat);
        cat.swim(150, cat);
        System.out.println("_______________________");

        Dog dog = new Dog("Gavdog");
        dog.run(150, dog);
        dog.swim(150, dog);
        System.out.println("_______________________");

        Dog superDog = new Dog("Superdog");
        superDog.run(500, superDog);
        superDog.swim(10, superDog);
        System.out.println("_______________________");

        System.out.println("Animals count: " + Animal.getCount());
        System.out.println("Dogs count: " + Dog.getDogCount());
        System.out.println("Cats count: " + Cat.getCatCount());
        System.out.println("_______________________");

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("cat1", 1);
        cats[1] = new Cat("cat2", 2);
        cats[2] = new Cat("cat3", 3);
        cats[3] = new Cat("cat4", 4);
        cats[4] = new Cat("cat5", 5);

        Plate plate = new Plate(9);
        plate.info();

        for (int i = 0; i < 5; i++) {
            Cat hungryCat = cats[i];
            if (plate.getFood() >= hungryCat.getAppetite()) {
                hungryCat.eat(plate);
            }
            System.out.println(format("Cat %s is fed? %s. Cat appetite is %s", hungryCat.getName(),
                    hungryCat.isFed(), hungryCat.getAppetite()));
        }
        plate.info();
        System.out.println("increase food");
        plate.increaseFood(2);
        plate.info();

        System.out.println("_______________________");
        Payment payment = new Payment();
        payment.setPurchase();
        payment.print();
    }
}