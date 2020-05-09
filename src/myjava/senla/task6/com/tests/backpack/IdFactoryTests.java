package senla.task6.com.tests.backpack;

import senla.task6.com.company.backpack.task.IdFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdFactoryTests {

    @Test
    void getNextId_severalCalls_returnsCorrectNextId() {
        int expected = 4;
        IdFactory idFactory = IdFactory.getInstance();
        idFactory.getNextId();
        idFactory.getNextId();
        idFactory.getNextId();
        int actual = idFactory.getNextId();
        Assertions.assertEquals(expected, actual);
    }
}