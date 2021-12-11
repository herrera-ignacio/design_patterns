public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack(); // Strategy - Dynamic behavior
        mallard.performFly(); // Strategy - Dynamic behavior
        mallard.swim(); // Inherited from Duck

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly(); // Change behavior at runtime!
    }
}
