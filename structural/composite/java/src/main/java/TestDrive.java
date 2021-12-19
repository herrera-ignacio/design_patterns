public class TestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE", "Breakfast");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Lunch");
        MenuComponent dinerMenu = new Menu("DINNER MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dinerMenu);

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "...", true, 2.99));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "...", true, 2.99));

        new Waitress(allMenus).printMenu();
    }
}
