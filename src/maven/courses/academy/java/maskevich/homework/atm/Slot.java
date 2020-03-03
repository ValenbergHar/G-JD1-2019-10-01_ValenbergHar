package by.academy.java.maskevich.homework.atm;

public class Slot extends AbstractMoneyItem implements Comparable<Slot> {

    public static final int MAX_QUANTITY = 100;

    public Slot(Nominal nominal) {
        super(nominal);
    }

    @Override
    public String toString() {
        return "\nSlot [nominal=" + getNominal() + ", quantity=" + getQuantity() + "]";
    }

    public void addQuantity(int quantity) {
        setQuantity(getQuantity() + quantity);
    }

    @Override
    public int compareTo(Slot o) {
        return getNominal().compareTo(o.getNominal());
    }

    public boolean isApplicable(Nominal nominal) {
        return getNominal().equals(nominal);
    }

    public void removeQuantity(int quantity) {
        setQuantity(getQuantity() - quantity);
    }
}