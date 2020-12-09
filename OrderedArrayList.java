public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {

    public OrderedArrayList() {
        super();
    }

    public OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public boolean add(E e) {
        super.add(findInsertIndex(e), e);
        return true;
    }

    public void add(int index, E element) {
        add(element);
    }


    private int findInsertIndex(E element) {
        //* simple linear search
        int size = size();
        for (int i = 0; i < size; i++) {
            if (get(i).compareTo(element) > 0) {
                return i;
            }
        }
        return size;
        //*/
    }

}
