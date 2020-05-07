package senla.task6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
	private double maxW;
	private double bestPrice;
	private List<Item> bestItems = null;

	public Backpack(double maxW) {
		this.maxW = maxW;

	}

	public double getMaxW() {
		return this.maxW;
	}

	public void makeAllSets(List<Item> items) {
		if (items.size() > 0)
			checkSet(items);

		for (int i = 0; i < items.size(); i++) {
			List<Item> newSet = new ArrayList<Item>(items);

			newSet.remove(i);

			makeAllSets(newSet);
		}

	}

	private void checkSet(List<Item> items) {
		if (bestItems == null) {
			if (calcWeigth(items) <= maxW) {
				bestItems = items;
				bestPrice = calcPrice(items);
			}
		} else {
			if (calcWeigth(items) <= maxW && calcPrice(items) > bestPrice) {
				bestItems = items;
				bestPrice = calcPrice(items);
			}
		}
	}

	private double calcWeigth(List<Item> items) {
		double sumW = 0;

		for (Item i : items) {
			sumW += i.getWeight();
		}

		return sumW;
	}

	private double calcPrice(List<Item> items) {
		double sumPrice = 0;

		for (Item i : items) {
			sumPrice += i.getValue();
		}

		return sumPrice;
	}

	public List<Item> getBestSet() {
		return bestItems;
	}

}