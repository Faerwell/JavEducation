package lesson3;

public class Computer {
    Ram ram;
    Cpu cpu;
    public static int counter;

    public Computer(Ram ram, Cpu cpu) {
        this.ram = ram;
        this.cpu = cpu;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
