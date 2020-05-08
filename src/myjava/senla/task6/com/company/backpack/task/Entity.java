package senla.task6.com.company.backpack.task;

public abstract class Entity {
    private int id;

    protected Entity(){
        this.id = IdFactory.getInstance().getNextId();
    }

    public int getId(){
        return id;
    }
}
