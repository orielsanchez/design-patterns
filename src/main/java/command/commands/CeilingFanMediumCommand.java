package command.commands;

import command.Command;
import command.vendor.CeilingFan;

public class CeilingFanMediumCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();

    }

    @Override
    public void undo() {
        CeilingFanUndo.undo(prevSpeed, ceilingFan);
    }
}
