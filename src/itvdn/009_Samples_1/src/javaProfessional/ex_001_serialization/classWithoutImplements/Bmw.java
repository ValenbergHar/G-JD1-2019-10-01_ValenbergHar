package javaProfessional.ex_001_serialization.classWithoutImplements;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bmw extends Car implements Serializable {
    private int price;
    private String model;
//    private Engine engine;
    private transient Engine engine;

    Bmw(int weight, int price, String model, Engine engine) {
        super(weight);
        this.price = price;
        this.model = model;
        this.engine = engine;
        System.out.println("Child Constructor");
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            // Все что можно записываем обычным способом
            oos.defaultWriteObject();
            // То что нормально записать не можем, то записываем напрямую через метод
            oos.writeInt(engine.getPower());
            oos.writeObject(engine.getProducer());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            // Все что можно считываем обычным способом
            ois.defaultReadObject();
            // То что записать не можем нормально, то считываем через метод readInt()
            this.engine = new Engine(ois.readInt(), (String) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", weight=" + getWeight() +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

class Engine { // implements Serializable{
    private int power;
    private String producer;

    Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", producer='" + producer + '\'' +
                '}';
    }

    public int getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }
}

abstract class Car implements Serializable {
//     private int weight = 10000;
    private int weight;

    Car() {
        System.out.println("Parent Constructor");
    }

    Car(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }
}