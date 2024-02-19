package Task4;

import java.util.Iterator;
import java.util.List;

public class SecondClass implements Runnable {
    private List<Integer> integerList;

    public SecondClass(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public  void run() {

        synchronized (this){

            Iterator<Integer> iterator = integerList.iterator();

            while(iterator.hasNext()){
                int digit = iterator.next();
                synchronized (iterator){
                    iterator.remove();
                }
            }

            if(integerList.isEmpty()){
                System.out.println("We removed all elements from list.");
            }

        }

    }
}
