import java.util.Iterator;

public class PersonsLinkedList implements ListADT<Person> {
    private class Node {
        Person data;
        Node next;

        public Node(Person p) {
            data = p;
            next = null;
        }

        public Node( ) {

        }
    }
    private Node first;
    private Node last;
    int size;

    public PersonsLinkedList() {
        first = last = null;
        size = 0;
    }

    // Task 1: Implement boolean removeElementAt(int index) function, which returns false if the index is out of
    // boundaries and true otherwise
    @Override
    public boolean removeElementAt(int index) {
        if(index>size) {
            return false;
        }
        if (index==0) {

            first = first.next;

        } else {
            Node n = first;
            Node n1 ;
            for (int i = 0; i <index-1 ; i++) {

                n = n.next;

            }
            n1=n.next;
            n.next=n1.next;
            n1=null;


        }
        size--;

        return true;
    }

    // Task 2: Implement the addBefore function which adds the element p right before the element b and returns dalse
    // if there is no element b in the list
    @Override
    public boolean addBefore(Person b, Person p) {
        int index = indexOf(b);
        Node node = new Node();
        node.data = p;
        node.next = null;
        Node n = first;

        if(index <0 || index > size ){
            return false;
        }

        if (index == 0){
            addFirst(b);
            size++;
            return true;
        }

        else  {
              addElementAt(index,p);

                node.next = n.next;

                size++;


        }

        return true;
    }


    //Inner Class to find the index of object
    private int indexOf (Object o) {
        int index = 0;
        if (o == null) {
            for ( Node x = first; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return 0 == size;
    }

    @Override
    public void clear() {

    }

    @Override
    public Person first() {
        if (isEmpty()) {
            return null;
        }
        return first.data;
    }

    @Override
    public Person last() {
        return null;
    }

    //I had to implement this function, to implement add before, if given index is 0
    @Override
    public void addFirst(Person b) {

        Node node = new Node();

        node.data = b;
        node.next = null;
        node.next =first;
        first = node;
        size++;

    }

    @Override
    public void addLast(Person b) {
        Node n = new Node(b);
        if (isEmpty()) {
            last = first = n;
        } else {
            last.next = n;
            last = n;
        }
        size++;
    }

    @Override
    public boolean removeFirst() {
        return false;
    }

    @Override
    public boolean removeLast() {
        return false;
    }

    @Override
    public Person getElementAt(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node temp = first;
        while (index  > 0) {
            temp = temp.next;
            index--;
        }
        return temp.data;
    }

    @Override
    public boolean addElementAt(int index, Person b) {
        Node node = new Node();
        node.data = b;
        node.next = null;
        Node n = first;
        if(index==0) {

            addFirst(b);

        } else {

            for (int i = 0; i < index - 1; i++) {

                n = n.next;

            }

            node.next = n.next;
            n.next = node;

            size++;
        }



        return false;
    }

    @Override
    public Iterator<Person> reverseIterator() {
        return null;
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}
