package javarush.hen;
public class BelarusianHen extends Hen{
    
    

	public  int getCountOfEggsPerMonth(){
       return 10;
    } 
    @Override
    public String getDescription(){
        return super.getDescription() + " ћо€ страна -" + BELARUS + ". я несу " + this.getCountOfEggsPerMonth()+ " €иц в мес€ц." ;
    }
}