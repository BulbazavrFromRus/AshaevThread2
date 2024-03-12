package Task11;


import java.util.Date;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();

        Formatter formatter = new Formatter(date);

        Thread thread1= new Thread(formatter);
        Thread thread2 = new Thread(formatter);
        Thread thread3 = new Thread(formatter);
        Thread thread4 = new Thread(formatter);
        Thread thread5 = new Thread(formatter);

        thread1.start();

        sleep(2000);

        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();




    }
}
