package senla.task6.com.company.backpack.task;

public class IdFactory {
    private static IdFactory _instance;
    private int currentId;
    private IdFactory(){
        currentId = 1;
    }

    public int getNextId(){
        return currentId++;
    }

    public static IdFactory getInstance(){
        if (_instance == null){
            _instance = new IdFactory();
        }

        return _instance;
    }
}