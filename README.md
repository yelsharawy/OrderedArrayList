# OrderedArrayList
12-09-20
# Discussion
- How do we find the index to insert at for OrderedArrayList?
  - We can do a simple search through the ArrayList, checking each element. Once an index is found such that the element is greater than the given element (`get(i).compareTo(element) > 0`), then that is the index we want to insert at, because that element and all subsequent elements will be pushed forwards, placing the element between an element that it is greater than and one that it is smaller than, maintaining order.
- What do we do with `add(int index, E element)` in OrderedArrayList?
  - The index is completely ignored, and the element is inserted such as to maintain order.
- How do we implement anything without instance variables?
  - Everything can be done through the ArrayList's methods by using `super`. The constructors can call `super()` and `super(initialCapacity)` appropriately, and we can use other methods such as `super.add` to interact with the underlying code.
