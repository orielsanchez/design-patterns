package command;

import command.commands.*;
import command.vendor.CeilingFan;
import command.vendor.GarageDoor;
import command.vendor.Light;
import command.vendor.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {ceilingFanHighCommand, kitchenLightOffCommand, livingRoomLightOnCommand, stereoOnCommand};
        Command[] partyOff = {ceilingFanOffCommand, kitchenLightOnCommand, livingRoomLightOffCommand, stereoOffCommand};

        MacroCommand partyOnMacroCommand = new MacroCommand(partyOn);
        MacroCommand partyOffMacroCommand = new MacroCommand(partyOff);


        remoteControl.setCommand(0, partyOnMacroCommand, partyOffMacroCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(4, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(6, ceilingFanLowCommand, ceilingFanOffCommand);

        System.out.println(remoteControl);

        for (int i = 0; i < 7; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            remoteControl.undoButtonWasPushed();
        }
    }
}
