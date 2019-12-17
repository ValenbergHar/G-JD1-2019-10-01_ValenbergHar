package by.academy.java.maskevich.homework.atm;

public enum Nominal {

    _10(10), _20(20), _50(50);

    private Nominal(int value) {
        this.value = value;
    }

    int value;
}