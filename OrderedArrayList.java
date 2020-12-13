public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {

    public OrderedArrayList() {
        super();
    }

    public OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public boolean add(E e) {
        checkValid(e);
        super.add(findInsertIndex(e), e);
        return true;
    }

    public void add(int index, E element) {
        add(element);
    }

    public E set(int index, E element) {
        checkValid(element);
        E returnValue = remove(index);
        add(element);
        return returnValue;
    }


    private int findInsertIndex(E element) {
        /* simple linear search (adds to end of any "equal" elements)
        int size = size();
        for (int i = 0; i < size; i++) {
            if (get(i).compareTo(element) > 0) {
                return i;
            }
        }
        return size;
        //*/
        //* binary search
        int left = 0;
        int right = size() - 1;
        while (right >= left) {
            int middle = (left + right) / 2;
            switch (get(middle).compareTo(element)) {
                case 1:
                    right = middle - 1;
                    break;
                case -1:
                case 0:  // (ensures adding to the end of "equal" elements)
                    left = middle + 1;
            }
        }
        return left;
        //*/
    }

}
