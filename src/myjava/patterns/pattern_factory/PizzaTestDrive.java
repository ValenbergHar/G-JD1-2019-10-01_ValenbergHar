package patterns.pattern_factory;

import patterns.pattern_factory.pizza.Pizza;
import patterns.pattern_factory.pizza.PizzaType;
import patterns.pattern_factory.store.PizzaStore;
import patterns.pattern_factory.store.chicago.ChicagoPizzaStore;
import patterns.pattern_factory.store.newyork.NYPizzaStore;

/**
 * @author rassoll @ created 29.05.2017 @ $Author$ @ $Revision$
 */
public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
