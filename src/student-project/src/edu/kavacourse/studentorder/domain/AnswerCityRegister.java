package edu.kavacourse.studentorder.domain;

import edu.kavacourse.studentorder.register.AnswerCityRegisterItem;

import java.util.ArrayList;
import java.util.List;

public class AnswerCityRegister {
    public boolean success;
    private List<AnswerCityRegisterItem> items;

    public void addItem(AnswerCityRegisterItem item) {
        if (items == null) {
            items = new ArrayList<>(10);
        }
        items.add(item);
    }

    public List<AnswerCityRegisterItem> getItems() {
        return items;
    }
}
