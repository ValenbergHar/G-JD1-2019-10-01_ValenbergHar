package javarush.hen;
public abstract class Hen implements Country {
    public abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я - курица.";
    }
    
}