package senla.task6.com.company;

import senla.task6.com.company.backpack.task.Backpack;
import senla.task6.com.company.backpack.task.Item;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter backpack max weight:");
		int userEnteredMaxWeight = 20;// get this from user
		Backpack backpack = new Backpack(userEnteredMaxWeight);
		ArrayList<Item> items = new ArrayList<>();
		System.out.println("Add items:");

		// while-loop
		System.out.println("Add item 1:");
		System.out.println("Enter price:");
		int userEnteredPrice1 = 2;
		int userEnteredWeight1 = 2;
		Item item1 = new Item(userEnteredPrice1, userEnteredWeight1);
		items.add(item1);

		backpack.addItems(items);
		backpack.showContent();
	}
}