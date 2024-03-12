package Task8;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class FirstClass implements Runnable{
    private List<Integer> integerList;
    private ReentrantLock locker;


    public FirstClass(List<Integer> integerList, ReentrantLock locker) {
        this.integerList = integerList;
        this.locker = locker;
    }



    @Override
    public void run() {
        locker.lock();

        try{
            for (int i = 0; i < 10000; i++) {
                integerList.add(i);
            }

            if(integerList.size() == 10000){
                System.out.println("We add " + integerList.size());
            }

        } finally {
            locker.unlock();
        }

    }
}

