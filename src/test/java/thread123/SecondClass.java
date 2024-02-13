package thread123;

public class SecondClass implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " "+Thread.currentThread().getState());
    }
}
