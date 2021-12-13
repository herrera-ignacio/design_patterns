package v2;

import v1.*;

public class PizzaFranchise extends PizzaStore {
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
