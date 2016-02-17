package dcll.kmac;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class MySimpleStackTest {


    @Test
    public void testIsEmpty() throws NoSuchElementException {
        MySimpleStack test = new MySimpleStack();

        //assert condition
        assertTrue("Le tableau doit etre vide", test.isEmpty());
        assertEquals("Le tableau doit avoir une taille de zero", 0, test.getSize());

    }

    @Test
    public void testGetSize() throws Exception {
        MySimpleStack test = new MySimpleStack();

        //assert condition
        assertEquals("Le tableau doit avoir une taille de zero", 0, test.getSize());
    }

    @Test
    public void testPush(){
        MySimpleStack test = new MySimpleStack();

        //assert condition
        assertEquals("Le tableau doit avoir une taille de zero",0,test.getSize());
        assertTrue("Le tableau doit etre vide",test.isEmpty());

        test.push(new Item(5));

        //assert condition
        assertEquals("Le tableau doit avoir une taille de 1",1,test.getSize());
        assertFalse("Le tableau ne doit plus etre vide", test.isEmpty());
    }

    @Test
    public void testPeek(){
        MySimpleStack test = new MySimpleStack();
        Item item = new Item(5);


        test.push(item);

        Item result = test.peek();
        //assert condition
        assertEquals("Le tableau doit avoir une taille de 1",1,test.getSize());
        assertFalse("Le tableau ne doit plus etre vide", test.isEmpty());
        assertSame(result, item);
        assertNotNull(result);
    }

    @Test
    public void testPeekException(){
        MySimpleStack test = new MySimpleStack();
        //should be make an exception
        Item result = test.peek();

        assertNull(result);
    }

    @Test
    public void testPop(){
        MySimpleStack test = new MySimpleStack();
        Item item = new Item(5);

        test.push(item);

        Item result = test.pop();
        //assert condition
        assertEquals("Le tableau doit avoir une taille de zero",0,test.getSize());
        assertTrue("Le tableau ne doit plus etre vide",test.isEmpty());
        assertSame(result, item);
        assertNotNull(result);
    }

    @Test(expected = NoSuchElementException.class)
     public void testPopException() throws NoSuchElementException {
        MySimpleStack test = new MySimpleStack();
        //should be make an exception
        test.pop();
    }
}