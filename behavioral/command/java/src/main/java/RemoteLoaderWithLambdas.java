import commands.LightOffCommand;
import commands.LightOnCommand;
import commands.StereoOffCommand;
import commands.StereoOnWithCDCommand;
import vendor.Light;
import vendor.Stereo;

import java.rmi.Remote;

public class RemoteLoaderWithLambdas {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light bedroomLight = new Light("Bedroom");
        Stereo stereo = new Stereo("Living room");

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, bedroomLight::on, bedroomLight::off);
        remoteControl.setCommand(2, () -> { stereo.on(); stereo.setCD(); stereo.setVolume(11); }, stereo::off);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(2);
    }
}
