package command.commands;

import command.Command;
import command.vendor.CeilingFan;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();

    }

    @Override
    public void undo() {
        CeilingFanUndo.undo(prevSpeed, ceilingFan);
    }


}
