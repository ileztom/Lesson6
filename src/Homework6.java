/**
 * Java 1. Homework 6
 * @author Tomov Ilya
 * @version 23.11.2021
 */

public class Homework6 {

    public static void main(String[] args){
        Cat cat = new Cat( 200, 0);
        System.out.println("cat run " + cat.run);
        System.out.println("cat swim " + cat.swim);

        Dog dog = new Dog(500, 10);
        System.out.println("dog run " + dog.run);
        System.out.println("dog swim " + dog.swim);
    }

    static class Animal {
        int run;
        int swim;

        Animal(int run, int swim) {
            this.run = run;
            this.swim = swim;
        }
    }

    static class Cat extends Animal {
        Cat(int run, int swim) {
            super(run, swim);
        }
    }

    static class Dog extends Animal {
        Dog(int run, int swim) {
            super(run, swim);
        }
    }
}