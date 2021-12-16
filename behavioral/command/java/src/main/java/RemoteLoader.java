import commands.LightOffCommand;
import commands.LightOnCommand;
import commands.StereoOffCommand;
import commands.StereoOnWithCDCommand;
import vendor.Light;
import vendor.Stereo;

import java.rmi.Remote;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light bedroomLight = new Light("Bedroom");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);

        StereoOnWithCDCommand livingRoomStereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand livingRoomStereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, bedroomLightOn, bedroomLightOff);
        remoteControl.setCommand(2, livingRoomStereoOnWithCD, livingRoomStereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(2);
    }
}
