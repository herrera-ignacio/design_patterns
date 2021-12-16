package turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i< 5; i++) {
            // Turkeys fly in short spurts, so we make up for it calling fly 5 times
            turkey.fly();
        }
    }
}
