public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        if (customerWantsCondiment()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    /**
     * This is a hook because the usblcass can override this method
     * but doesn't have to
     * @return boolean
     */
    public boolean customerWantsCondiment() {
        return true;
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
