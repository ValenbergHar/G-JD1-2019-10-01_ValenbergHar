package by.academy.java.maskevich.homework.ATM;

public class ResultItem extends AbstractMoneyItem {

    public ResultItem(Nominal nominal) {
        super(nominal);
    }

    public ResultItem(Nominal nominal, int quantity) {
        super(nominal, quantity);
    }

    @Override
    public String toString() {
        return "\nResultItem [nominal=" + getNominal() + ", quantity=" + getQuantity() + "]";
    }

}