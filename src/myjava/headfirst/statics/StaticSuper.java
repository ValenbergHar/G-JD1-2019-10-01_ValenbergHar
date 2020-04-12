package headfirst.statics;

public class StaticSuper {
	static {
		System.out.println("Relative static block");
	}

	public StaticSuper() {
		System.out.println("Relative constructor");
	}
}