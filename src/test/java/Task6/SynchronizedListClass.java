package Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListClass implements Runnable{

    private  List<Integer> integerList;

    public SynchronizedListClass(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        List<Integer> syncList = Collections.synchronizedList(integerList);
        List<Integer> newList = new ArrayList<>();


        synchronized (syncList){
            for(int i = 0; i < 10000; i++){
               newList.add(i);
            }

            if(newList.size() == 10000){
                System.out.println("We added " + newList.size());
            }
        }

        synchronized (newList){
            Iterator<Integer> integerIterator = newList.iterator();

            while(integerIterator.hasNext()){
                integerIterator.next();
                integerIterator.remove();
            }

            System.out.println("We removed all elements from list, new size =  " + newList.size());

        }


    }
}
