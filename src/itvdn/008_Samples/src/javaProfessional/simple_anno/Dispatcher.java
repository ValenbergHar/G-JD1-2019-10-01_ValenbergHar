package javaProfessional.simple_anno;

import javaProfessional.simple_anno.annotation.MathAnno;
import javaProfessional.simple_anno.handler.MathHandler;

import java.lang.reflect.Method;

/**
 * Created by Yevhenii Tykhonov.
 */
public class Dispatcher {
    public static void main(String[] args) {
        MathHandler mathHandler = new MathHandler();
        Class<?> cl = MathHandler.class;
        try {
            Method m = cl.getDeclaredMethod("addTwoNumbers", int.class, int.class);
            MathAnno mathAnno = m.getAnnotation(MathAnno.class);
            mathHandler.addTwoNumbers(mathAnno.num1(), mathAnno.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
