package homework_2;


import java.util.Random;

public class Main {

    public static final int COUNT = 100000;

    public static void main(String[] args) {

        List list = new IntArrayList();
//        IntList list = new IntLinkedList();

        Random random = new Random();
        for (int i = 0; i < COUNT; i++) {
            list.add(random.nextInt(100));
        }

        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            int value = list.get(100000/2);
            //System.out.println("Value: " + value);
        }
        long timeDiff = System.currentTimeMillis() - time;
        double seconds = timeDiff / 1000.0;

        System.out.println("Time: " + seconds);

    }
}
