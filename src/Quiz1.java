public class Quiz1 {
    public static <T> void print(CollectionADT<T> c) {
        System.out.println("Printing the elements of " + c.getClass().getSimpleName());
        //for(T b: c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.getElementAt(i));
        }
    }

    // Task 4: Implement a recursive function which removes list elements at odd positions.
    public static <T> void removeOddPositionElements(ListADT<T> l) {

    }

    public static void testListFunctions(ListADT<Person> l) {
        System.out.println("Running tests for " + l.getClass().getSimpleName() + " functions");
        System.out.println("==========================================");
        l.addLast(new Student("Alex", "Black", 1998));
        l.addLast(new Student("Aram", "Smith", 2002));
        l.addLast(new Teacher("Anahit", "Smith", 1982));
        l.addLast(new Student("Ani", "Woods", 1992));
        l.addLast(new Teacher("Artak", "Tailor", 1978));

        //print(l);
        // removeElementAt negative test - remove element at non existing index and confirm that return value is false and size has not changed
        boolean res = l.removeElementAt(20);
        int size = l.size();
        if (res == false && size == l.size()) {
            System.out.println("Task1 negative test - Success");
        } else {
            System.out.println("Task1 negative test - Failure");
        }

        // removeElementAt positive test - remove element at index 2 and confirm that now the element at index 3 is shifter one position to left
        Person p = l.getElementAt(3);
        res = l.removeElementAt(2);
        //print(l);
        if (res == true && l.size() == size - 1 && p == l.getElementAt(2)) {
            System.out.println("Task1 test - Success");
        } else {
            System.out.println("Task1 test - Failure");
        }


        p = new Teacher("Mary", "Johnes", 1975);
        size = l.size();

        // addBefore negative test - insert a new element after a non existing element in list and confirm that no new element is inserted
        Person notExisting = new Student("Garry", "Wild", 1999);
        res = l.addBefore(notExisting, p);
        if (res == false && size == l.size()) {
            System.out.println("Task2 negative test - Success");
        } else {
            System.out.println("Task2 negative test - Failure");
        }

        // addBefore positive (corner case) test - insert a new element after the first element in list and confirm that the newly inserted element is the
        // new first one and element under index 1 is the old first
        Person b = l.first();
        res = l.addBefore(b, p);
        if (res == true && l.size() == size + 1 && p == l.getElementAt(0) && b == l.getElementAt(1)) {
            System.out.println("Task2 test1 - Success");
        } else {
            System.out.println("Task2 test1 - Failure");
        }

        // addBefore positive (general case) test - insert a new element after an element under specified index in list and confirm that the newly inserted
        // element is the placed under the specified index and the old element under that indes is shifter one pos to right
        int index = 3;
        b = l.getElementAt(index);
        res = l.addBefore(b, p);
        if (res == true && l.size() == size + 2 && p == l.getElementAt(index) && b == l.getElementAt(index + 1)) {
            System.out.println("Task2 test2 - Success");
        } else {
            System.out.println("Task2 test2 - Failure");
        }

        /*

        // reverseIterator tests
        Iterator<Person> ri = l.reverseIterator();
        if (ri != null) {
            Person first = null;
            if (ri.hasNext()) {
                first = ri.next();
            }
            if (first != null && first.getTitle() == "Java for Beginners") {
                System.out.println("Task3 test - Success");
            } else {
                System.out.println("Task3 test - Failure");
            }
            Person last = first;
            while (ri.hasNext()) {
                last = ri.next();
            }
            if (last != null && last.getTitle() == "Bible") {
                System.out.println("Task3 test - Success");
            } else {
                System.out.println("Task3 test - Failure");
            }

        } else {
            System.out.println("Task3 test - Failure");
        }
         */
        System.out.println("==========================================");
        System.out.println();
    }

    public static void testQueueFunctions() {
        System.out.println("Running tests for PersonsArrayQueue functions");
        System.out.println("==========================================");
        PersonsArrayQueue q = new PersonsArrayQueue();
        q.enqueue(new Student("Alex", "Black", 1998));
        q.enqueue(new Student("Aram", "Smith", 2002));
        q.enqueue(new Teacher("Anahit", "Smith", 1982));
        q.enqueue(new Student("Ani", "Woods", 1992));
        q.enqueue(new Teacher("Artak", "Tailor", 1978));
        /* test guidelines for task 5
         - uncomment the print functions and implement enqueue function to confirm that your addElementAt function works as expected
         - implement getElementAt() function and confirm that the added under index is added correctly
         */
        //print(q);
        Person p = new Teacher("Paruyr", "Sevak", 1980);
        q.addElementAt(0, p);
        p = new Teacher("Vahan", "Teryan", 1970);
        q.addElementAt(3, p);
        p = new Teacher("Hamo", "Sahyan", 1970);
        q.addElementAt(q.size() - 1, p);
        //print(q);
        System.out.println("==========================================");
        System.out.println();
    }

    public static void testRecursiveFunction() {
        System.out.println("Running tests for removeOddPositionElements function");
        System.out.println("==========================================");
        PersonsLinkedList l = new PersonsLinkedList();
        l.addLast(new Student("Alex", "Black", 1998));
        l.addLast(new Student("Aram", "Smith", 2002));
        l.addLast(new Teacher("Anahit", "Smith", 1982));
        l.addLast(new Student("Ani", "Woods", 1992));
        l.addLast(new Teacher("Artak", "Tailor", 1978));
        /* test guidelines for task 4
         - uncomment the print functions and confirm visually that your code works
         - check that the size of the list is half its size after calling the removeOddPositionElements function
         - save the elements under indexes 1 and 3 and confirm that those are no more in the list through trying to add an
         element before them
         - do the same for elements under even indexes and confirm that they are present in the list after the remove recursive call
         */
        //print(ll)
        removeOddPositionElements(l);
        //print(ll)
        System.out.println("==========================================");
        System.out.println();
    }

    public static void main(String[] str) throws Exception {
        PersonsLinkedList ll = new PersonsLinkedList();
        testListFunctions(ll);

        PersonsArrayList al = new PersonsArrayList();
        testListFunctions(al);

        testRecursiveFunction();

        testQueueFunctions();
    }
}

