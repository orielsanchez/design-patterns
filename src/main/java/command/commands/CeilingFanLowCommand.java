package command.commands;

import command.Command;
import command.vendor.CeilingFan;

public class CeilingFanLowCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();

    }

    @Override
    public void undo() {
        CeilingFanUndo.undo(prevSpeed, ceilingFan);
    }
}
