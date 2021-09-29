import java.util.Iterator;

public class PersonsArrayQueue implements QueueADT {
    private Person[] arr;
    private int size;
    private int firstIndex;

    public PersonsArrayQueue() {
        arr = new Person[10];
        size = 0;
        firstIndex = 0;
    }

    // Task 5: Implement a private addElementAt(int index) function which inserts an element in the PersonsArrayQueue
    // at a certain position.
    @Override
    public boolean addElementAt(int index, Person b) {
        if(index <0 || index > size) {
            return false;
        }
        else {
                    resize();
                    Person[] temp = new Person[arr.length * 2];
                    for (int i = 0; i < size; i++) {

                        temp[i] = arr[i];

                    }
                    arr[index] = b;
                    for (int i = index; i < size; i++) {
                        arr[i + 1] = temp[i];


                    }
                    size++;
                }

            return true;

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
    public boolean removeElementAt(int index) {
        return false;
    }

    @Override
    public Person getElementAt(int index) {
        return null;
    }

    public void resize() {
    }

    @Override
    public void enqueue(Person b) {

    }

    @Override
    public void dequeue() {

    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}
