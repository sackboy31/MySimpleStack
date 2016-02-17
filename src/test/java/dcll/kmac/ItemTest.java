package dcll.kmac;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testGetValue() throws Exception {
        Item item = new Item(5);

        assertSame("La valeur doit etre 5",5,item.getValue());


    }

    @Test
    public void testSetValue() throws Exception {
        Item item = new Item(5);

        item.setValue(6);
        assertSame("La valeur doit etre 6",6,item.getValue());
    }
}