public class GumballMachineTestDrive {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        GumballMachine gumballMachine = new GumballMachine(args[0], Integer.parseInt(args[1]), "waiting for quarter");
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
