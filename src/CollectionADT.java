public interface CollectionADT<T> extends Iterable<T> {
     public int size();
     public boolean isEmpty();
     public void clear();
     public boolean removeElementAt(int index);
     public T getElementAt(int index);
     public boolean addElementAt(int index, T b);
}
