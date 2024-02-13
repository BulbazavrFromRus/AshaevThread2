package Task4;

import java.util.List;

public class FirstClass implements Runnable{
    private List<Integer> integerList;

    public FirstClass(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            integerList.add(i);
        }
    }
}
