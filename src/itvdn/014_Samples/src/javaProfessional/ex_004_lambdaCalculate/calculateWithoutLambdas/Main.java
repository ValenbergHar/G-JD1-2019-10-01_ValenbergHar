package javaProfessional.ex_004_lambdaCalculate.calculateWithoutLambdas;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation() {
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        int z = operation.calculate(20, 10);

        System.out.println(z); // 30
    }
}

interface Operation {
    int calculate(int x, int y);
}
