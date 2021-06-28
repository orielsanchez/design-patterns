package command.commands;

import command.Command;

/**
 * “The NoCommand object is an example of a null object.
 * A null object is useful when you don’t have a meaningful object to return,
 * and yet you want to remove the responsibility for handling null from the client.”
 * <p>
 * Excerpt From: Eric Freeman. “Head First Design Patterns, 2nd Edition.”
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
