package javaProfessional.simple_varargs;

/**
 * Created by Yevhenii Tykhonov.
 */
public class Main {
    private int calcSum(int i, int... values) {
//        int result = 0;
//        for (int tmp : values) {
//            result += tmp;
//        }
        return 10;
    }

    private int calcSum(Integer i, int... values) {
//        int result = 0;
//        for (int tmp : values) {
//            result += tmp;
//        }
        return 5;
    }
    public static void main(String... args) {
        Main m = new Main();
//        System.out.println(m.calcSum(1, 2, 3));
//        System.out.println(m.calcSum(1, 2));
//        System.out.println(m.calcSum());
    }
}
