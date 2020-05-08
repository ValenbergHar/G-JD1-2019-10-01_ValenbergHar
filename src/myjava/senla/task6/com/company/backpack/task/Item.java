package senla.task6.com.company.backpack.task;

public class Item extends Entity{
    private int price;
    private int weight;

    public Item(int price, int weight){
        this.price = price;
        this.weight = weight;
    }

    public int getPrice(){
        return price;
    }

    public int getWeight(){
        return weight;
    }

    public int getRate(){
        return price * weight;
    }
}