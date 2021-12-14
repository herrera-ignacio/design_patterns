public class PizzaStoreTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.createPizza("cheese");
        System.out.printf("Pizza created: %s", pizza.getName());
    }
}
