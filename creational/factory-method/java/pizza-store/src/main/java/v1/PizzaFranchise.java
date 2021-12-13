package v1;

public class PizzaFranchise {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
//        PizzaStore chicagoStore = new PizzaStore(new ChicagoPizzaFactory());
//        PizzaStore nyStore = new PizzaStore(new NyPizzaFactory());

        pizzaStore.orderPizza("greek");
        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("cheese");
    }
}