package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyThreadClass implements Runnable{

    private static List<Integer> integerList;

    public MyThreadClass(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
           for(int i = 0; i < 10; i++){
                   addElements();
                   deleteElements();
           }
    }

    public static synchronized void addElements(){

        for(int i = 0 ; i < 10000; i++){
            integerList.add(i);
        }

        if(integerList.size() == 10000){
            System.out.println("We add " + integerList.size());
        }
    }

    public static synchronized void deleteElements(){
        Iterator<Integer> iterator = integerList.iterator();

        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        if(integerList.isEmpty()){
            System.out.println("We removed all elements from list.");
        }

    }

}
