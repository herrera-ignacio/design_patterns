package commands;

public class NoCommand implements UndoableCommand {

    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
