package patterns.pattern_factory.store.chicago;

import patterns.pattern_factory.ingredient.PizzaIngredientFactory;
import patterns.pattern_factory.ingredient.chicago.ChicagoPizzaIngredientFactory;
import patterns.pattern_factory.pizza.*;
import patterns.pattern_factory.store.PizzaStore;

/**
 * @author rassoll
 * @ created 29.05.2017
 * @ $Author$
 * @ $Revision$
 */
public class ChicagoPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(PizzaType pizzaType)
    {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        switch (pizzaType)
        {
            case CHEESE:
                pizza = new CheseePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
