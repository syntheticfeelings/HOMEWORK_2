package homework_2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IntArrayList array = new IntArrayList();
        array.add(4);
        array.add(2);

        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(3,4);
        array.print();
        array.remove(1);
        array.print();
        array.remove(2);
        array.remove(3);
        array.remove(3);
        array.remove(3);
        array.remove(2);
        array.remove(3);
        array.remove(3);
        array.remove(3);
//        array.add(22);
        array.print();
    }
}
