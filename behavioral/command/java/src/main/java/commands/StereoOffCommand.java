package commands;

import vendor.Stereo;

public class StereoOffCommand implements UndoableCommand {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) { this.stereo = stereo; }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}
