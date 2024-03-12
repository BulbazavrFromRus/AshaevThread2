package Task8;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class SecondClass implements Runnable {
    private List<Integer> integerList;
    private ReentrantLock locker;


    public SecondClass(List<Integer> integerList, ReentrantLock locker) {

        this.integerList = integerList;
        this.locker= locker;
    }

    @Override
    public  void run() {

        locker.lock();
           try{
               for(int i = 0; i < 10000; i++){
                   Random r = new Random();
                   int index = r.nextInt(integerList.size());
                   integerList.remove(index);
               }

               if(integerList.isEmpty()){
                   System.out.println("We removed all elements from list.");
               }
           } finally {
               locker.unlock();
           }

    }
}
