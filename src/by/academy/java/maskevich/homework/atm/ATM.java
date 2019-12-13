package by.academy.java.maskevich.homework.atm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ATM {
    private List<Slot> slots = new ArrayList<Slot>();

    public ATM(List<Slot> slots) {
        this.slots = slots;
        Collections.sort(this.slots, Collections.reverseOrder());
    }

    public void addMoney(int quantity, Nominal nominal) {
        for (Slot slot : slots) {
            boolean isNotOverflow = Slot.MAX_QUANTITY >= (slot.getQuantity() + quantity);
            if (slot.isApplicable(nominal) && isNotOverflow) {
                slot.addQuantity(quantity);
                return;
            }
        }

        throw new RuntimeException("no slot with nominal:" + nominal);
    }

    public WithdrawResult withdraw(int amount) {
        WithdrawResult result = new WithdrawResult();
        for (Slot slot : slots) {
            Nominal nominal = slot.getNominal();
            int slotQuantity = slot.getQuantity();
            boolean isEmpty = slotQuantity == 0;
            if (isEmpty) {
                continue;
            }

            int nominalValue = nominal.value;
            int resultItemQuantity = Math.min(slotQuantity, amount / nominalValue);

            boolean isTooBigAmount = resultItemQuantity == 0;
            if (isTooBigAmount) {
                continue;
            }

            List<ResultItem> items = result.getItems();
            items.add(new ResultItem(nominal, resultItemQuantity));

            amount -= nominalValue * resultItemQuantity;

            if (amount == 0) {
                break;
            }
        }

        if (amount == 0) {
            List<ResultItem> items = result.getItems();
            for (ResultItem resultItem : items) {
                removeMoney(resultItem.getNominal(), resultItem.getQuantity());
            }
            result.setSuccess(true);
        } else {
            result.setItems(null);
            result.setErrorMessage("Can't calculate result");
            result.setSuccess(false);
        }

        return result;
    }

    private void removeMoney(Nominal nominal, int quantity) {
        for (Slot slot : slots) {
            if (slot.isApplicable(nominal)) {
                int slotQuantity = slot.getQuantity();
                int quantityToRemove = Math.min(slotQuantity, quantity);
                slot.removeQuantity(quantityToRemove);
                quantity -= quantityToRemove;

                if (quantity == 0) {
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\nATM [slots=" + slots + "]\n";
    }
}