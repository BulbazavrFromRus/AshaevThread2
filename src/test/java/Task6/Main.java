package Task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
       Thread thread1 = new Thread(new SynchronizedListClass(integerList));

       Thread thread2 = new Thread(new SynchronizedListClass(integerList));

       thread1.start();
       thread2.start();
    }
}
