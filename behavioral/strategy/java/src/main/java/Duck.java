public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /** Strategies **/
    public void performFly() {
        flyBehavior.fly(); // Delegate to behavior class
    }

    public void performQuack() {
        quackBehavior.quack(); // Delegate to behavior class
    }

    /** Setting behavior dynamically **/
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}