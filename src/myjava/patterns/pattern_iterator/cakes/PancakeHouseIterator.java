package patterns.pattern_iterator.cakes;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
	MenuItem[] items;

	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

}
