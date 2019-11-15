package by.academy.java.maskevich.homework.task4.task44;
public class Engine {
    private boolean hasStarted = false;
    public void startEngine() {
        this.hasStarted = true;
        System.out.println("Engine is on");
    }
    public void stopEngine() {
        this.hasStarted = false;
    }
}