package edu.javacourse.methods;

import edu.javacourse.methods.ann.Generator;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class PasswordFactory {
    public static String getPassword() {
        try {
            String clazz = getGenerator();
            Class<?> genClass = Class.forName(clazz);
            // Object generator = genClass.newInstance();
            Method[] methods = genClass.getMethods();
            for (Method m : methods) {
              //  System.out.println(m.getName());
                Generator annotation = m.getAnnotation(Generator.class);
                if (annotation != null) {
                    Object generator = createObject(genClass);
                    String pswd = (String) m.invoke(generator);
                    return pswd;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return " ";
    }

    private static String getGenerator() throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("generator.properties"));
        return p.getProperty("generator");
    }

    private static Object createObject(Class clazz) throws IllegalAccessException, InstantiationException, IOException {
        Object obj = clazz.newInstance();
        return fillProperties(obj);
    }

    private static Object fillProperties(Object obj) throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("generator.properties"));
        for (String str : p.stringPropertyNames()) {
            if (!"generator".equals(str)) {
                String value = p.getProperty(str);
                System.out.println(value);
            }
        }
        return obj;
    }
}
