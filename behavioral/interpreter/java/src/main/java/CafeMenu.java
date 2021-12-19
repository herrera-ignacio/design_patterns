import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        MenuItem menuItem = new MenuItem("Veggie Burger and Air Fries", "...", true, 2.99);
        menuItems.put(menuItem.getName(), menuItem);
        MenuItem menuItem2 = new MenuItem("Soup of the day", "...", false, 2.99);
        menuItems.put(menuItem2.getName(), menuItem2);
        MenuItem menuItem3 = new MenuItem("Burrito", "...", false, 2.99);
        menuItems.put(menuItem3.getName(), menuItem3);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
