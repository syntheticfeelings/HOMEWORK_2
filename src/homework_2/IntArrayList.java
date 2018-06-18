package homework_2;


import java.util.Arrays;

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
        contains(index);
        if (size >= arr.length) {
            resize();
        }
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = element;
        size++;
    }

    private void resize() {
        int newSize = arr.length * 3 / 2 + 1;
        System.out.println("newSize: " + newSize);
        int[] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    @Override
    public boolean remove(int index) {
        contains(index);
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        size--;
        return true;
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public void set(int index, int element) {
        contains(index);
        arr[index] = element;
    }

    @Override
    public boolean removeElement(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.arraycopy(arr, i + 1, arr, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return arr[index];
    }

    @Override
    public void contains(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }


}
