import java.util.ArrayList;

public class NoNullArrayList<E extends Comparable<E>> extends ArrayList<E> {

    public NoNullArrayList() {
        super();
    }

    public boolean add(E e) {
        checkValid(e);
        return super.add(e);
    }

    public void add(int index, E element) {
        checkValid(element);
        super.add(index, element);
    }


    private void checkValid(E e) {
        if (e == null) {
            throw new IllegalArgumentException("cannot add null to NoNullArrayList");
        }
    }
}
