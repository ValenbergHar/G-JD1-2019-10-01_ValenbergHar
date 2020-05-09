package senla.task6.com.tests.backpack;

import senla.task6.com.company.backpack.task.Backpack;
import senla.task6.com.company.backpack.task.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BackpackTests {

    @Test
    void isAlreadyFilled_noItems_returnsFalse() {
        Backpack backpack = new Backpack(20);
        Assertions.assertFalse(backpack.isAlreadyFilled());
    }

    @Test
    void isAlreadyFilled_addedItems_returnsTrue() {
        Backpack backpack = new Backpack(20);
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(2, 2));
        backpack.addItems(items);
        Assertions.assertTrue(backpack.isAlreadyFilled());
    }
}