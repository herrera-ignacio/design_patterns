import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    int position = 0;
    MenuItem[] list;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Not implemented");
    }




}
