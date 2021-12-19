import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;

@AllArgsConstructor
public class Waitress {
    MenuComponent menus;

    public void printMenu() {
        menus.print();
    }
}
