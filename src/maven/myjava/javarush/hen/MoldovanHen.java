package javarush.hen;
public class  MoldovanHen extends Hen{
    @Override
    public  int getCountOfEggsPerMonth(){
       return 9;
    } 
    @Override
    public String getDescription(){
        return super.getDescription() + " ћо€ страна -" + MOLDOVA + ". я несу " + this.getCountOfEggsPerMonth() + " €иц в мес€ц." ;
    }
}