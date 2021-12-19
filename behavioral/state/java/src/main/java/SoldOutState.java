import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
