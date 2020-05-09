package senla.task6.com.company.backpack.task;

import java.util.ArrayList;
import java.util.Comparator;

/*
    This solution doesn't count a possibility of different
    items with the same rate to fit into a backpack.
    For example: 1x20 == 5*2 + 5*2
*/
public class Aggregator {
    public Backpack fillInBackpackWithItems(ArrayList<Item> items, Backpack backpack){
        if (backpack.isAlreadyFilled()){
            return backpack;
        }

        ArrayList<Item> finalCollection = new ArrayList<>();
        items.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1item, Item o2item) {
            	double o1 = o1item.getRate();
            	double o2 = o2item.getRate();
                if (o1 == o2){
                    return 0;
                }

                return o1 > o2 ? -1 : 1;
            }
        });

        int counter = 0;
        int accumulativeWeight = 0;
        while (accumulativeWeight <= backpack.getMaxWeight() && counter < items.size())
        {
            Item item = items.get(counter++);
            if (accumulativeWeight + item.getWeight() <= backpack.getMaxWeight())
            {
                accumulativeWeight += item.getWeight();
                finalCollection.add(item);
            }
        }

        backpack.addItems(finalCollection);
        return backpack;
    }
}