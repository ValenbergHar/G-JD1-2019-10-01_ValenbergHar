package patterns.pattern_command.simple;

public class SimpleRemoteControl {
	Command slot;
	Command undoCommand;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}