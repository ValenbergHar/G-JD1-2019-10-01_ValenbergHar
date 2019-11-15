package by.academy.java.maskevich.homework.task4.task44;
public class Auto {
    private Engine engine = new Engine();;
    private Wheel frontRight = new Wheel();
    private Wheel frontLeft = new Wheel();
    private Wheel rearRight = new Wheel();
    private Wheel rearLeft = new Wheel();
    private String Brand;
    private int fuel;
    public void changeWheel(double radius) {
        this.frontRight = new Wheel(radius);
        this.frontLeft = new Wheel(radius);
        this.rearRight = new Wheel(radius);
        this.rearLeft = new Wheel(radius);
        System.out.println("Wheels are replaced");
    }
    public void isGo() {
        engine.startEngine();
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    public void writeBrand(String Brand) {
        System.out.println(Brand);
    }
    public void putFuel(int fuel) {
        System.out.printf("Car is tanked up by %d l", fuel);
    }
}