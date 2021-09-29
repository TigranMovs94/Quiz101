import java.util.Iterator;

public class PersonsArrayQueueReverseIterator implements Iterator {
    Person [] arr = new Person[100];
    int index;
    int size;
    public PersonsArrayQueueReverseIterator (Person[] arr){

        reverse_recursively_inPlace(arr,index,size);



    }


    private void reverse_recursively_inPlace(Person [] list, int index, int size){
        if(index>=(int)size/2){
            return;
        }
        Person tmp = list[index];
        list[index]=list[size-index-1];
        list[size-index-1] = tmp;
        reverse_recursively_inPlace(list,index+1,size);
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
