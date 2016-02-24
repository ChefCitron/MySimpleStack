package dcll.fcab;
import java.util.ArrayList;
import java.util.EmptyStackException;
import dcll.fcab.InterfSimpleStack;
/**
 *
 * Created by M20110625 on 24/02/2016.
 */
public class SimpleStack implements InterfSimpleStack {

    int size;
    ArrayList<Item> array;


    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty(){

        return getSize()==0;
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize(){

        return this.size;

    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item){
          array.add(item);
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException{
        try {
            return array.get(getSize()-1);
        }
        catch (EmptyStackException e){
            e.toString();
        }
        return null;
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException{

        try{
            Item i = new Item(array.get(getSize()-1));
            array.remove(size-1);
            size--;
            return i;

        }
        catch (EmptyStackException e) {
            e.toString();
        }
        return null;
    }


}
