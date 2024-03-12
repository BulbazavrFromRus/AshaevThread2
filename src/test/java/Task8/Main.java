package Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> integerList = new ArrayList<>();
        ReentrantLock reentrantLock = new ReentrantLock();

        Thread thread1 = new Thread(new FirstClass(integerList, reentrantLock));

        Thread thread2 = new Thread(new SecondClass(integerList, reentrantLock));

        thread1.start();

        //Thread.sleep(3000);

        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(integerList);

    }
}
