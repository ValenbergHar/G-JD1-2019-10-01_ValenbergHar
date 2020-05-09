package senla.task6.com.tests.backpack;

import senla.task6.com.company.backpack.task.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemTests {

    @Test
    void getRate_validPriceAndWeight_returnsCorrectRate() {
        double expected = 20;
        Item item = new Item(5, 4);
        double actual = item.getRate();
        Assertions.assertEquals(expected, actual);
    }
}