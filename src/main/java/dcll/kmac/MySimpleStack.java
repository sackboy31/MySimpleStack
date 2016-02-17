package dcll.kmac;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * Created by 21502947 on 10/02/2016.
 */
public class MySimpleStack implements SimpleStack {

    private LinkedList<Item> itemList;

    public MySimpleStack() {
        this.itemList = new LinkedList<Item>();
    }

    @Override
    public boolean isEmpty() {
        return itemList.isEmpty();
    }

    @Override
    public int getSize() {
        return itemList.size();
    }

    @Override
    public void push(Item item) {
        itemList.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return itemList.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return itemList.pop();
    }
}
