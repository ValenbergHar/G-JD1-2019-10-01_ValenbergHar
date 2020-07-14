package javaProfessional.ex_004_lambdaCalculate.calculateWithLambdas;

public class Main {

    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation div = (x, y) -> x / y;
        Operation multiple = (x, y) -> x * y;

        int resultAdd = add.calculate(10, 20);
        int resultSub = sub.calculate(10, 20);
        int resultDiv = div.calculate(10, 20);
        int resultMultiple = multiple.calculate(10, 20);

        System.out.println(resultAdd); // 30
        System.out.println(resultSub); // 30
        System.out.println(resultDiv); // 30
        System.out.println(resultMultiple); // 30
    }
}

@FunctionalInterface
interface Operation {
    int calculate(int x, int y);

    // J8
    default void show() {
        System.out.println("hello");
    }

    static void print() {
        System.out.println("world");
    }
}
