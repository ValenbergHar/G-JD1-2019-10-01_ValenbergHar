package javaProfessional.ex_001_lambdaExpression.withoutLambdaExpression;

public class Main {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // Подписка на событие(Подписываемся 1 раз и не зависимо сколько раз
        // вызовется включение лампы, столько раз будет вызыватся метод лампы)
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        // Захват переменных, можем передать в анонимный класс/лямбда выражение
        String message = "Пожар";
        // Если изменяем значение переменной - ошибка компиляции
//        message = "Fire";


        // Громоздкая запись для 1 метода
//        class Fire implements ElectricityConsumer {
//            public void electricityOn(Object sender){
//                System.out.println("Пожар");
//            }
//        }

        // Анонимный класс
        switcher.addElectricityListener(
                new ElectricityConsumer() {
                    public void electricityOn(Object sender) {
                        System.out.println(message);
                    }
                }
        );

        switcher.switchOn();
    }
}
