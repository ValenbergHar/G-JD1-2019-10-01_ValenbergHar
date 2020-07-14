package javaProfessional.ex_001_serialization.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса файл и указываем файл
        File f = new File("D:\\Java Professional Course_video\\009_Serialization_and_Clonning\\009_Samples\\src\\javaProfessional\\ex_001_serialization\\serialization\\file2.txt");
        Car c = new Car(50000, "Bmw");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            // Сериализуем объект Bmw в байт-код
            oos.writeObject(c);

            // Десериализуем объект Car с байт-кода
            Car car = (Car) ois.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
