package command;

/**
 * “The Command Pattern encapsulates a request as an object,
 * thereby letting you parameterize other objects with
 * different requests, queue or log requests, and support undoable operations.”
 * <p>
 * Excerpt From: Eric Freeman. “Head First Design Patterns, 2nd Edition.”
 */

public interface Command {

    public void execute();
    public void undo();
}
