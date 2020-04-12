package patterns.patterns_templatemethod;

import patterns.patterns_templatemethod.beverage.CoffeeWithHook;
import patterns.patterns_templatemethod.beverage.TeaWithHook;

/**
 * @author rassoll
 * @created 08.06.2017
 * @$Author$
 * @$Revision$
 */
public class BeverageTestDrive
{
    public static void main(String[] args)
    {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
