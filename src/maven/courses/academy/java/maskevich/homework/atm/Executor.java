package by.academy.java.maskevich.homework.atm;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    public static void main(String[] args) {
        List<Slot> slots = new ArrayList<Slot>();
        slots.add(new Slot(Nominal._20));
        slots.add(new Slot(Nominal._10));
        slots.add(new Slot(Nominal._10));
        slots.add(new Slot(Nominal._50));

        ATM atm = new ATM(slots);
        System.out.println("add money");
        atm.addMoney(20, Nominal._50);
        atm.addMoney(20, Nominal._10);
        atm.addMoney(20, Nominal._20);
        atm.addMoney(100, Nominal._10);
        atm.addMoney(20, Nominal._10);
        atm.addMoney(20, Nominal._50);

        System.out.println(atm);

        WithdrawResult withdraw = atm.withdraw(3810);
        System.out.println(withdraw);

        System.out.println(atm);
    }
}