import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GumballMonitor {
    final GumballMachine machine;

    public void report() {
        System.out.println("Gumball machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount());
        System.out.println("Current state: " + machine.getState());
    }
}
