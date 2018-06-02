package homework_2;


public class IntArrayList implements List {
    private int SIZE = 10;

    private int ELEMENT = 0;
    private int DELETED = 999999999;
    private int[] array = new int[SIZE];
    int DELETE_COUNT = 0;


    @Override
    public void add(int value) {
        if (ELEMENT == array.length - 1) {
            resize(array.length * 3 / 2 + 1);
        }
        array[ELEMENT++] = value;

    }

    @Override
    public void add(int index, int element) {
        if (index == array.length - 1) {
            resize(SIZE * 3 / 2 + 1);
        }
        array[index] = element;
        ELEMENT++;

    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        resize(10);
        ELEMENT = 0;
    }

    @Override
    public void contains(int value) {
    }

    @Override
    public boolean isEmpty() {
        if (ELEMENT == 0) {
            return true;
        } else {
            return false;
        }
    }

    void sort() {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] == DELETED) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void remove(int index) {
        array[index] = DELETED;
        sort();
        DELETE_COUNT++;

        if (ELEMENT < SIZE && SIZE >= 10)
            resize(SIZE);
        ELEMENT--;
    }


    @Override
    public void removeElement(int element) {
        for (int i = 0; i < array.length; i++) {
            array[i] = element;
        }

    }

    @Override
    public void set(int index, int element) {
        array[index] = element;

    }

    @Override
    public int size() {
        return ELEMENT;
    }

    @Override
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void resize(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, SIZE);
        array = newArray;
    }

}
