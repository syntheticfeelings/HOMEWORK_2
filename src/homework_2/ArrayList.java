package homework_2;


public class ArrayList implements List {
    private int SIZE = 10;
    private int ELEMENT = 0;
    private int[] array = new int[SIZE];


    @Override
    public void add(int value) {
        if (ELEMENT == array.length - 1) {
            resize(array.length * 3 / 2 + 1);
        }
        array[ELEMENT++] = value;

    }

    @Override
    public int get(int index) {
        return 0;
    }

    public void resize(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, ELEMENT);
        array = newArray;
    }
}
