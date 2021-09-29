public class test {
    public static void main(String[] args) {

        PersonsLinkedList students = new PersonsLinkedList();
        Student mek = new Student("Hello","Kitty",25);
        Student secon = new Student("Vaxo","Iskandaryan",15);
        Student third = new Student("Vahram", "Sahakyan",15);


        students.addLast(mek);
        students.addLast(secon);
        //students.addBefore(third,third);


        for (int i = 0; i <students.size-1 ; i++) {

            System.out.println(students.getElementAt(i));

        }


    }
}
