package Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        List<Integer> integerList = new ArrayList<>();

        Thread thread1 = new Thread(new FirstClass(integerList));
        Thread thread2 = new Thread(new SecondClass(integerList));

        thread1.start();
        thread2.start();



    }
}
