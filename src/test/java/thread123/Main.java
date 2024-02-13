package thread123;

public class Main {
    public static void main(String[] args) throws InterruptedException{


        //2
       /* Thread thread = new Thread(new MyRunnableClass());

        System.out.println(thread.getState());

        thread.start();

        thread.join();

        System.out.println(Thread.currentThread().getState());

        System.out.println("Program finished");
*/
        //*********************************************************
        //3
        Thread thread1 = new Thread(new FirstClass());
        Thread thread2 = new Thread(new SecondClass());
        Thread thread3 = new Thread(new ThirdClass());

        System.out.println(thread1.getState());
        thread1.start();

        System.out.println(thread2.getState());
        thread2.start();

        System.out.println(thread3.getState());
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Program finished");





    }
}
