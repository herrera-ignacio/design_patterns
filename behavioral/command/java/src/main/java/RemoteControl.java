import commands.Command;
import commands.NoCommand;
import commands.UndoableCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command emptyCommand = new NoCommand();

        // Initialize command arrays
        for (int i = 0; i < 7 ; i++) {
            onCommands[i] = emptyCommand;
            offCommands[i] = emptyCommand;
        }

        // Undo Comment will get dynamically populated
        undoCommand = emptyCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        System.out.println("[REMOTE] Undo");
        ((UndoableCommand) undoCommand).undo();
    }

    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------- Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer
                    .append("[slot ")
                    .append(i).append("]\t")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("\t")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append("\n");
        }

        stringBuffer
                .append("[undo]\t\t")
                .append(undoCommand.getClass().getSimpleName())
                .append("\n");

        return stringBuffer.toString();
    }
}
