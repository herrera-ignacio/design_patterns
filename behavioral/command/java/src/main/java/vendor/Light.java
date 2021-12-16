package vendor;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("[LIGHT] On");
    }

    public void off() {
        System.out.println("[LIGHT] Off");
    }
}
