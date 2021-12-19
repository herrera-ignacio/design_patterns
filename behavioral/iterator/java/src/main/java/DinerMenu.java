import java.util.Iterator;

/**
 * Menu based on static array
 */
public class DinerMenu implements Menu  {
    MenuItem[] list;

    public DinerMenu(MenuItem[] list) {
        this.list = list;
    }

    public static DinerMenu getInstance() {
        MenuItem[] menuItems = new MenuItem[6];
        menuItems[0] = new MenuItem("Vegetarian BLT", "...", true, 2.99);
        menuItems[1] = new MenuItem("BLT", "...", false, 2.99);
        menuItems[2] = new MenuItem("Soup of the day", "...", false, 2.99);
        menuItems[3] = new MenuItem("Hot dog", "...", false, 2.99);
        menuItems[4] = new MenuItem("Burger", "...", false, 2.99);
        menuItems[5] = new MenuItem("Veggie Burger", "...", true, 2.99);

        return new DinerMenu(menuItems);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(this.list);
    }
}
