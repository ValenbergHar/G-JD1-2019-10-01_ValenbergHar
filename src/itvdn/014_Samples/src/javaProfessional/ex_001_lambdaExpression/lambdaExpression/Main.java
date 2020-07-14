package javaProfessional.ex_001_lambdaExpression.lambdaExpression;

public class Main {

    private static void fire(Object sender) {
        System.out.println("Fire!!!");
    }

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
        // message = "Fire";

        /* Лямбда выражение
            1) Если у нас 1 параметр, то мы можем не указывать тип параметра
            2) Круглые скобки можно опустить
        */
        switcher.addElectricityListener(sender -> System.out.println(message));

//        switcher.addElectricityListener(sender -> {
    //            out.print("Пожар");
    //            out.println("!!!");
    //        });

//        switcher.addElectricityListener((Object sender) -> System.out.println("Пожар"));

// ============================================================

//        switcher.addElectricityListener(s -> Main.fire(s));

        // :: - в данном случае указывает на то, что используем именно метод fire
        // сокращение с "::" возможно тогда, когда в методе кол-во параметров совпадает с лямбда-выражением
        switcher.addElectricityListener(Main::fire);

        switcher.switchOn();
    }
}
