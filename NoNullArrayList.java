import java.util.ArrayList;

public class NoNullArrayList<E extends Comparable<E>> extends ArrayList<E> {

    public NoNullArrayList() {
        super();
    }

    public NoNullArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public boolean add(E e) {
        checkValid(e);
        return super.add(e);
    }

    public void add(int index, E element) {
        checkValid(element);
        super.add(index, element);
    }

    public E set(int index, E element) {
        checkValid(element);
        return super.set(index, element);
    }


    protected void checkValid(E e) {
        if (e == null) {
            throw new IllegalArgumentException("cannot put null into NoNullArrayList");
        }
    }
}
