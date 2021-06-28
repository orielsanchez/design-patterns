package command;

import command.commands.GarageDoorOpenCommand;
import command.commands.LightOnCommand;
import command.vendor.GarageDoor;
import command.vendor.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        LightOnCommand lightOn = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageOpen);
        simpleRemoteControl.buttonWasPressed();
    }
}
