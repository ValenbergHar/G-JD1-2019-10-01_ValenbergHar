package foxford;

public class Item {
	private double weight;
	private double value;

	public Item(double weight, double value) {
		this.weight = weight;
		this.value = value;
	}

	public double getWeight() {
		return weight;
	}

	public double getValue() {
		return value;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double valueUnitOfWeight() {
		return value / (double) weight;
	}

	public String toString() {
		return "{w: " + weight + ", v: " + value+"}";

	}
}