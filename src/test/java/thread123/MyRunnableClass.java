package thread123;

import java.util.List;

public class MyRunnableClass implements Runnable{

    private  List<Integer> integerList;

    public MyRunnableClass(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
             integerList.add(i);
        }
    }
}
