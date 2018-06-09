package homework_2;


public class IntArrayList implements List {
    private int[] arr = new int[10];
    private int size = 0;

    @Override
    public void add(int value) {
        if (size >= arr.length) {
            resize();
        }
        arr[size] = value;
        size++;
    }

    @Override
    public void add(int index, int element) {
        //TODO
    }

    private void resize() {
        int newSize = arr.length * 3 / 2 + 1;
        System.out.println("newSize: " + newSize);
        int[] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return arr[index];
    }

    @Override
    public int size() {
        return size;
    }


}
