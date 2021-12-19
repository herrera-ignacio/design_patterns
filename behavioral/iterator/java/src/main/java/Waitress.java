import lombok.AllArgsConstructor;

import java.util.Iterator;

@AllArgsConstructor
public class Waitress {
    Menu dinerMenu;
    Menu pancakeHouseMenu;
    Menu cafeMenu;

    public void printMenu() {
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("MENU\n----\nLUNCH");
        printMenu(pancakeHouseMenuIterator);

        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);

        System.out.println("\nDINNER");
        printMenu(cafeMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
