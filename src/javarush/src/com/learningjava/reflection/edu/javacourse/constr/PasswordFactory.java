package edu.javacourse.constr;

import edu.javacourse.constr.ann.Generator;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class PasswordFactory {


    public static String getPassword() throws Exception {
        try {
            String clazz = getGenerator();
            Class<?> genClass = Class.forName(clazz);
            // Object generator = genClass.newInstance();
            Method[] methods = genClass.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
                Generator annotation = m.getAnnotation(Generator.class);
                if (annotation != null) {
                    Object generator = createObject(genClass);
                    m.setAccessible(true);
                    String pswd = (String) m.invoke(generator);
                    return pswd;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return " ";
    }

    private static String getGenerator() throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("generator.properties"));
        return p.getProperty("generator");
    }

    private static Object createObject(Class clazz) throws Exception {
        Constructor constr = clazz.getConstructor(String.class, String.class);
        Object o = constr.newInstance("FromConstructorAlg", "FromConstructorName");
        return o;
    }

    private static Object fillProperties(Object obj) throws IOException, NoSuchFieldException, IllegalAccessException {
        Properties p = new Properties();
        p.load(new FileReader("generator.properties"));
        for (String str : p.stringPropertyNames()) {
            if (!"generator".equals(str)) {
                String value = p.getProperty(str);
                System.out.println(str + "=" + value);

               Field f= obj.getClass().getDeclaredField(str);
               f.setAccessible(true);
               f.set(obj,value);
            }
        }
        return obj;
    }
}
