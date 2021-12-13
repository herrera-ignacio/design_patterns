package v1;

public class GreekPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing greek pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking greek pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting greek pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing greek pizza");
    }
}
