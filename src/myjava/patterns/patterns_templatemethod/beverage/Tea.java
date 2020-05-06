package patterns.patterns_templatemethod.beverage;

/**
 * @author rassoll
 * @created 08.06.2017
 * @$Author$
 * @$Revision$
 */
public class Tea extends CaffeineBeverage
{
    @Override
    void brew()
    {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments()
    {
        System.out.println("Adding Lemon");
    }
}