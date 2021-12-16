package vendor;

import java.util.Set;

public class Stereo {
    int volume;
    String name;

    public Stereo(String name) { this.name = name; }

    public void on() {
        System.out.println("[STEREO] On");
    }

    public void off() {
        System.out.println("[STEREO] Off");
    }

    public void setCD() {
        System.out.println("[STEREO] Set CD");
    }

    public void setVolume(int volume) {
        System.out.println(System.out.format("[STEREO] Set Volume %d", volume));
        this.volume = volume;
    }
}
