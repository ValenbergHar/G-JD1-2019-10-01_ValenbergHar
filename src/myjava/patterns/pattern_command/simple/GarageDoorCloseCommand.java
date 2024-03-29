package patterns.pattern_command.simple;

public class GarageDoorCloseCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.close();
	}

	@Override
	public void undo() {
		garageDoor.open();
	}
}