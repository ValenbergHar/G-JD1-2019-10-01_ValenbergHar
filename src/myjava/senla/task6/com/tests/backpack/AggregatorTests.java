package senla.task6.com.tests.backpack;

import senla.task6.com.company.backpack.task.Aggregator;
import senla.task6.com.company.backpack.task.Backpack;
import senla.task6.com.company.backpack.task.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AggregatorTests {

	@Test
	void fillInBackpackWithItems_itemSumIsLessThanMaxWeight_returnsCorrectSequence() {
		ArrayList<Item> items = new ArrayList<>();
		items.add(new Item(4, 2));
		items.add(new Item(2, 2));
		items.add(new Item(1, 2));

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);

		Aggregator aggregator = new Aggregator();
		Backpack backpack = new Backpack(10);
		backpack = aggregator.fillInBackpackWithItems(items, backpack);

		ArrayList<Integer> actual = backpack.getItemIds();
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void fillInBackpackWithItems_itemSumIsMoreThanMaxWeight_returnsCorrectSequence() {
		ArrayList<Item> items = new ArrayList<>();
		items.add(new Item(90, 12));
		items.add(new Item(4, 2));
		items.add(new Item(2, 2));
		items.add(new Item(1, 2));
		items.add(new Item(1, 11));
		items.add(new Item(1, 20));

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(2);
		expected.add(3);
		expected.add(4);

		Aggregator aggregator = new Aggregator();
		Backpack backpack = new Backpack(10);
		backpack = aggregator.fillInBackpackWithItems(items, backpack);

		ArrayList<Integer> actual = backpack.getItemIds();
		Assertions.assertEquals(expected, actual);
	}
}