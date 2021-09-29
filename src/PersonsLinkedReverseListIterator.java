import java.util.Iterator;

public class PersonsLinkedReverseListIterator <Persons> implements Iterator  {
    public class Node {

        Person person;
        Node next;
    }

    public void PersonsLinkedReverseListIterator ( Node node) {

        reverse_rec(node);

    }

    private Node reverse_rec (Node node) {

        if (node.next == null) {
            return node;
        } else {

            Node tail = reverse_rec(node.next);
            node.next = null;
            Node tmp = tail;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
            return tail;

        }

    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
