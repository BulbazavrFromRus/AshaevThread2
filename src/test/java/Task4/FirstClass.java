package Task4;

import thread123.MyRunnableClass;

import java.util.List;

public class FirstClass implements Runnable{
    private List<Integer> integerList;

    public FirstClass(List<Integer> integerList) {
        this.integerList = integerList;
    }



    @Override
    public void run() {
        synchronized (integerList) {

            for (int i = 0; i < 10000; i++) {
                 integerList.add(i);
            }

            if(integerList.size() == 10000){
                System.out.println("We add " + integerList.size());
            }

        }

    }
}
