package patterns.pattern_factory.ingredient;

import patterns.pattern_factory.ingredient.ingredients.*;

/**
 * @author rassoll @ created 30.05.2017 @ $Author$ @ $Revision$
 */
public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();
}
