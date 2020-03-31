package patterns.pattern_command.simple;

public class RemoteControlTest { // кл≥ент
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(); // ≥н≥цы€тар
		Light light = new Light();// атрымальн≥к
		LightOnCommand lightOn = new LightOnCommand(light);// каманда з паказаннем атрымальн≥к
		
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpen=new GarageDoorOpenCommand(garageDoor);
		
		
		remote.setCommand(lightOn);// ≥н≥цы€тар атрымл≥вае каманду
		remote.buttonWasPressed();
		
		
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
	}
}