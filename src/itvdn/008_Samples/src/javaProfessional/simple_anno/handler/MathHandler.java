package javaProfessional.simple_anno.handler;

import javaProfessional.simple_anno.annotation.MathAnno;

/**
 * Created by Yevhenii Tykhonov.
 */
public class MathHandler {
    @MathAnno(num1 = 10, num2 = 20)
    public void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
