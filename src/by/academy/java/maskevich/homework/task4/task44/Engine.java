package by.academy.java.maskevich.homework.task4.task44;

public class Engine {

	public Engine(int volume, EngineType engineType) {
		super();
		this.volume = volume;
		this.engineType = engineType;
	}

	private int volume;
	private EngineType engineType;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}

}
