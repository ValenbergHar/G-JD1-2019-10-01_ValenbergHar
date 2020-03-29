package patterns.pattern_factory.ingredient.chicago;

import patterns.pattern_factory.ingredient.PizzaIngredientFactory;
import patterns.pattern_factory.ingredient.ingredients.*;
import patterns.pattern_factory.*;

/**
 * @author rassoll
 * @ created 30.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies()
    {
        Veggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
