package Task5;

import Task4.FirstClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {


        List<Integer> integerList = new ArrayList<>();
        ClassWithMethods classWithMethods = new ClassWithMethods(integerList);


       Thread thread1 = new Thread(new AddClass(classWithMethods));
       Thread thread2 = new Thread(new DeleteClass(classWithMethods));

       thread1.start();
       thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       System.out.println(integerList);

    }
}
