package homework_2;

public interface List {

    void add(int element);
    void add(int index, int element);
    int get(int index);
    void clear();
    void contains(int value);
//    boolean isEmpty();
    boolean remove(int index);
    boolean removeElement(int element);
    void set(int index, int element);
    int size();

}
