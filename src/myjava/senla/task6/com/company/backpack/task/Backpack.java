package senla.task6.com.company.backpack.task;

import java.util.ArrayList;

public class Backpack extends Entity{
    private int maxWeight;
    private ArrayList<Item> items;

    public Backpack(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int getMaxWeight(){
        return maxWeight;
    }

    public void addItems(ArrayList<Item> items){
        for (Item item : items) {
            this.items.add(item);
        }
    }

    public boolean isAlreadyFilled(){
        return items.size() > 0;
    }

    public ArrayList<Integer> getItemIds(){
        ArrayList<Integer> ids = new ArrayList<>();
        for (Item item : items) {
            ids.add(item.getId());
        }

        return ids;
    }

    public void showContent(){
        System.out.println("Backpack contains:");
        for (Item item : items) {
            System.out.println("Price:" + item.getPrice());
        }
    }
}