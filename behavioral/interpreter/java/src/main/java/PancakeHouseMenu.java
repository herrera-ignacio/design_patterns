import java.util.ArrayList;
import java.util.Iterator;

/**
 * Menu based on ArrayList
 */
public class PancakeHouseMenu implements Menu {
    private final ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
    }

    public static PancakeHouseMenu getInstance() {
        PancakeHouseMenu menu = new PancakeHouseMenu();
        menu.menuItems.add(new MenuItem("K&B Pancakes", "...", true, 2.99));
        menu.menuItems.add(new MenuItem("Regular Pancakes", "...", false, 2.99));
        menu.menuItems.add(new MenuItem("Blueberry Pancakes", "...", true, 2.99));
        menu.menuItems.add(new MenuItem("Waffles", "...", true, 2.99));
        return menu;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
