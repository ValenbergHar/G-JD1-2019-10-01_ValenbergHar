package senla.task6;

import java.util.Arrays;
import java.util.Comparator;

public class BackPack {

	public static void main(String[] args) {
		final Item item1 = new Item(4, 40);
		final Item item2 = new Item(5, 30);
		final Item item3 = new Item(6, 8);
		final Item item4 = new Item(10, 54);

		final Item[] items = { item1, item2, item3,item4 };

		Arrays.sort(items, Comparator.comparingDouble(Item::valueUnitOfWeight).reversed());
		System.out.println(Arrays.toString(items));
		final int W = 10;
		int weightInBackpack = 0;
		int valueInBackpack = 0;
		int currentItem = 0;

		while (currentItem < items.length && weightInBackpack != W) {
			if (weightInBackpack + items[currentItem].getWeight() < W) {
				valueInBackpack += items[currentItem].getValue();
				weightInBackpack += items[currentItem].getWeight();
			} else {
				valueInBackpack += (W - weightInBackpack) / (double) items[currentItem].getWeight()*items[currentItem].getValue();
				weightInBackpack=W;
			}
			currentItem++;
		}
		System.out.println( + valueInBackpack);

	}
}
