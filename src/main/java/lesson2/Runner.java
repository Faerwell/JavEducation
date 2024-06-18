package lesson2;

public class Runner {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setAge(2);

        tom.greeting();
        tom.feed("meat", "milk");
        tom.sleep();
        tom.hunt("mouse");
    }
}
