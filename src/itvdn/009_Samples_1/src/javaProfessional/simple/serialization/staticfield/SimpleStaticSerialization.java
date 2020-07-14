package javaProfessional.simple.serialization.staticfield;

import java.io.*;

/**
 * Created by Yevhenii Tykhonov.
 */
public class SimpleStaticSerialization implements Serializable{
    private static int staticNumber;
    private int nonStaticNumber;

    public SimpleStaticSerialization(int nonStaticNumber) {
        this.nonStaticNumber = nonStaticNumber;
        staticNumber = nonStaticNumber;
    }

    public static void serializeStatic(ObjectOutputStream oos) throws IOException {
        oos.writeInt(staticNumber);
    }

    public static void deserializeStatic(ObjectInputStream oos) throws IOException {
        staticNumber = oos.readInt();
    }

    @Override
    public String toString() {
        return staticNumber + " " + nonStaticNumber;
    }
}

class Dispatcher {
    public static void main(String[] args) {
        SimpleStaticSerialization s = new SimpleStaticSerialization(10);

        File f = new File("D:\\Java Professional Course_video\\009_Serialization_and_Clonning\\009_Samples\\src\\javaProfessional\\simple\\serialization\\serizalization\\staticfield\\test.txt");

        System.out.println("First values = " + s);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {

            SimpleStaticSerialization.serializeStatic(outputStream);
            outputStream.writeObject(s);

            s = new SimpleStaticSerialization(30);
            System.out.println("After serialization = " + s);

            SimpleStaticSerialization.deserializeStatic(inputStream);
            s = (SimpleStaticSerialization)inputStream.readObject();

            System.out.println("After deserialization = " + s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}