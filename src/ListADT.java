import java.util.Iterator;

public interface ListADT<T> extends CollectionADT<T> {
    public T first();
    public T last();
    public void addFirst(T b);

    public void addLast(T b);
    public boolean removeFirst();
    public boolean removeLast();
    public boolean removeElementAt(int index);
    public T getElementAt(int index);
    public boolean addElementAt(int index, T b);
    public boolean addBefore(T b, T p);
    public Iterator<T> reverseIterator();
}
