package lesson2.cat;

import java.util.Arrays;

public class Cat implements Animal {
    private String name;
    private int age;

    public Cat() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void greeting() {
        System.out.println("Nya!");
    }

    @Override
    public void sleep() {
        System.out.printf("Cat %s is sleeping now.\n", getName());
    }

    @Override
    public void feed(String... products) {
        System.out.printf("Cat %s eats " + Arrays.toString(products) + "\n", getName());
    }

    @Override
    public void hunt(String prey) {
        System.out.printf("Cat %s caught %s\n", getName(), prey);
    }
}
