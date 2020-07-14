package javaProfessional.ex_001_serialization.classWithoutImplements;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса файл и указываем файл
        File f = new File("D:\\Java Professional Course_video\\009_Serialization_and_Clonning\\009_Samples\\src\\javaProfessional\\ex_001_serialization\\classWithoutImplements\\file1.txt");
        // значение на 1000 не меняет, необходимо изменить Car implements Serializable
        Bmw c = new Bmw(1000, 5000, "x6", new Engine(1500, "BMW"));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            // Сериализуем объект Bmw в байт-код
            oos.writeObject(c);

            // Десериализуем объект Bmw с байт-кода
            // При десериализации вызывается конструктор суперкласса
            Bmw newBmw = (Bmw) ois.readObject();
            System.out.println(newBmw);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
