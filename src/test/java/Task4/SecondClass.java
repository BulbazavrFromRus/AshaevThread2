package Task4;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SecondClass implements Runnable {
    private List<Integer> integerList;

    public SecondClass(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public  void run() {

        synchronized (integerList){

           for(int i = 0; i < 10000; i++){
               Random r = new Random();
               int index = r.nextInt(integerList.size());
               integerList.remove(index);
           }


            if(integerList.isEmpty()){
                System.out.println("We removed all elements from list.");
            }

        }

    }
}
