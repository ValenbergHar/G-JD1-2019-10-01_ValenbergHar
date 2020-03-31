package patterns.pattern_command.simple;

public interface Command {
	public void execute();

	public void undo();
}