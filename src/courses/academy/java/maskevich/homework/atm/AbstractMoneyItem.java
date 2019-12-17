package by.academy.java.maskevich.homework.atm;

public abstract class AbstractMoneyItem {

    private Nominal nominal;

    private int quantity;

    public AbstractMoneyItem(Nominal nominal) {
        super();
        this.nominal = nominal;
    }

    public AbstractMoneyItem(Nominal nominal, int quantity) {
        super();
        this.nominal = nominal;
        this.quantity = quantity;
    }

    public Nominal getNominal() {
        return nominal;
    }

    public void setNominal(Nominal nominal) {
        this.nominal = nominal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}