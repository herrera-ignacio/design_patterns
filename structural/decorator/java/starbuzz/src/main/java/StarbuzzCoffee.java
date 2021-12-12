public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();

        System.out.printf("%s, $%f\n", beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);

        System.out.printf("%s, $%f\n", beverage2.getDescription(), beverage2.cost());
    }
}
