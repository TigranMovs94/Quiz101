import java.util.Iterator;

public class PersonsArrayList implements ListADT<Person> {
    private Person[] arr;
    private int size;

    public PersonsArrayList() {
        arr = new Person[10];
        size = 0;
    }

    // Task 1: Implement boolean removeElementAt(int index) function, which returns false if the index is out of
    // boundaries and true otherwise
    @Override
    public boolean removeElementAt(int index) {

        if(index < 0 || index > size){
            return false;
        }

        if (index >= 0 && index < size) {

            for (int i = index; i < size - 1; i++) {

                arr[i] = arr[i + 1];

            }
            size--;
        }


        return true;
    }

    // Task 2: Implement the addBefore function which adds the element p right before the element b and returns dalse
    // if there is no element b in the list
    @Override
    public boolean addBefore(Person b, Person p) {
        int index  =  findIndex(arr,b);
        if(index == -1 ){
            return false;
        }

        if(index > size){
            return false;
        }
        else
        {
             addElementAt(index,p);
        }
          return true;


    }

    //Inner class to find index of
    private  int findIndex(Person arr[], Person t)
    {

        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;

        while (i < len) {

            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
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
        return arr[0];
    }

    @Override
    public Person last() {
        return null;
    }

    @Override
    public void addFirst(Person b) {

    }

    public void resize() {

    }

    @Override
    public void addLast(Person b) {
        resize();
        arr[size] = b;
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
        return arr[index];
    }

    @Override
    public boolean addElementAt(int index, Person b) {

        if (index < 0 || index > size) {

            return false;
        } else {
            if (index == size || index > size) {
                addLast(b);
            } else {
                if (index >= 0) {
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
            }
            return true;
        }

    }





    @Override
    public Iterator<Person> reverseIterator() {
        return new PersonsArrayListReverseIterator(arr);
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}
