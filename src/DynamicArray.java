public class DynamicArray {
    private int[] items;
    private int count;

    public DynamicArray(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void insert(int item) {
        // if array if full, resize it
        if (items.length == count) {
            // create a new array(twice the size)
            int[] newItems = new int[count * 2];

            // copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // set "items" to the new array
            items = newItems;
        }

        // add the new item at the end of array
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // shift array to fill the hole
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    /// using the new DynamicArray class:(needs to be in another class ??)
//    public static void main(String[] args) {
//        DynamicArray numbers = new DynamicArray(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        numbers.removeAt(3);
//        numbers.print();
//        System.out.println(numbers);
//    }
}
