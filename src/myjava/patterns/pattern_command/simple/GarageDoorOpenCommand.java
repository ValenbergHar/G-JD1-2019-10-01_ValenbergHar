package patterns.pattern_command.simple;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.open();
	}

	@Override
	public void undo() {
		garageDoor.close();		
	}
}