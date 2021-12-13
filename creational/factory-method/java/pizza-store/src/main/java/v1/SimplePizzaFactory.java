package v1;

public class SimplePizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "greek":
                return new GreekPizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                return new CheesePizza();
        }
    }
}
