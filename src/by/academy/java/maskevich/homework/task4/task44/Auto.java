package by.academy.java.maskevich.homework.task4.task44;
public class Auto {
    
    Engine engine = new Engine();
    Wheel wheel = new Wheel();
    
    public void writeBrand() {
        System.out.println("Auto: ZAZ-969");
    }
    public void goCar() {
        engine.start();
        engine.fuelup();    
    }
    public void replaseWheel(int i) {
        wheel.setWheel(i);
        System.out.printf("Wheel number %d is replased", wheel.getWheel());
        
    }
}