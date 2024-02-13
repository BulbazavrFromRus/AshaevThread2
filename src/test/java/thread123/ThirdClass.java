package thread123;

public class ThirdClass implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " "+Thread.currentThread().getState());
    }
}
