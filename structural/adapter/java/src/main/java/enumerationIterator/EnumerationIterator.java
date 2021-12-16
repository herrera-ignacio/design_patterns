package enumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * We want to support legacy classes still producing Enumeration interfaces
 * but using the new Iterator interface
 */
public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
