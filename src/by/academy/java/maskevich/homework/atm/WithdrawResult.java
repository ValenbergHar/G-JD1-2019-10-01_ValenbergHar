package by.academy.java.maskevich.homework.atm;

import java.util.ArrayList;
import java.util.List;

public class WithdrawResult {

    private Boolean success;

    private String errorMessage;
    private List<ResultItem> items=new ArrayList<ResultItem>();

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<ResultItem> getItems() {
        return items;
    }

    public void setItems(List<ResultItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "WithdrawResult [success=" + success + ", errorMessage=" + errorMessage
                + ", items=" + items + "]";
    }



}