/**
 * GB Java. Homework 6
 *
 * @author Viktor A. Volkov
 * @version 6.3.2022
 */
class HWApp6 {

    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal.run(150));
            System.out.println(animal.run(200));
            System.out.println(animal.run(400));
            System.out.println(animal.run(500));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(10));
            System.out.println(animal.swim(15));
        }
        System.out.println("Created by animals: " + Animal.getCountOfAnimals());
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Cat extends Animal {
    Cat (int runLimit) {
        super(runLimit, 0);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " does not swim!";
    }
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals;

    Animal (int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " couldn't run " + distance;
        }
        else {
            return className + " was able to run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " couldn't swim " + distance;
        }
        else {
            return className + " was able to swim " + distance;
        }
    }

    @Override
    public String toString() {
        return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}