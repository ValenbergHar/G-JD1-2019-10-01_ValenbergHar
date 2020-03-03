package javarush;
public class Stattic {
    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new Stattic().method3();
       // method3(); in m4 kill static
    }

    public void method3() {
        method4();
    }

    public static void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        System.out.println(step);
        if (step > 2)
            return;
        main(null);
    }
}