package commands;

public interface UndoableCommand extends Command {
    public void undo();
}
