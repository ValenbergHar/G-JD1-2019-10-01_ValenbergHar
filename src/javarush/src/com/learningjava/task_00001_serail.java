package com.learningjava;

import java.io.*;

public class task_00001_serail {
    public static void main(String[] args) {
        testRead();
        testWrite();
    }

    private static void testRead() {
        try (FileInputStream fos = new FileInputStream("out.dat");
             ObjectInputStream ois = new ObjectInputStream(fos)) {
            First first = (First) ois.readObject();
            System.out.println(first.getFirstCode());
            System.out.println(first.getFirstName());
            System.out.println(first.getProcessor());

    } catch(IOException ex) {
        ex.printStackTrace();
    }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
}

    private static void testWrite() {
        First first = new First();
        first.setFirstCode("Zianon");
        first.setFirstName("Pazniak");
        first.setProcessor(new ProcessImpl());

        try (FileOutputStream fos = new FileOutputStream("out.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(first);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
