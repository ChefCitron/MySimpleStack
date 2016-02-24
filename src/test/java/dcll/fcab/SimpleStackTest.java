package dcll.fcab;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    @Test
    public void testIsEmpty() throws Exception {
        SimpleStack stack= new SimpleStack();
        //code under test
        stack.isEmpty();

        assertEquals("stack must be empty",0,stack.getSize());
    }

    @Test
    public void testGetSize() throws Exception {
        SimpleStack stack = new SimpleStack();
        Item item = new Item();
        stack.push(item);
        //code under test

        int i = stack.getSize();
        //assertions

        assertEquals("The stack constain 1 item",1, i);
    }

    @Test
    public void testPush() throws Exception {
       SimpleStack stack = new SimpleStack();
        Item item = new Item();

        // Code under test
        stack.push(item);

        // assertions (oracle)
        assertFalse("The stack must be not empty", !stack.isEmpty());
        assertEquals("The stack constains 1 item", 1, stack.getSize());
        assertSame("The pushed item is on top of the stack", item, stack.peek());

    }

    @Test
    public void testPeek() throws Exception {

        SimpleStack stack = new SimpleStack();
        Item item = new Item(2);
        stack.push(item);
        //Code under test

        stack.peek();

        //assertions

        assertSame("The item must be the same", item, stack.peek());
    }

    @Test
    public void testPop() throws Exception {
        SimpleStack stack = new SimpleStack();
        Item item = new Item(1);
        stack.push(item);

        //code under test

        stack.pop();

        //assertions
        assertTrue("The Stack must be empty", stack.isEmpty());
        assertEquals("The Stack must be contains 0 element",0,stack.getSize());

    }
}