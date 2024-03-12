package Task9;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Ball ball = new Ball();

        /*ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Pong(ball));
        executorService.execute(new Ping(ball));
        TimeUnit.SECONDS.sleep(5);
        executorService.shutdown();*/


        Thread thread1 = new Thread(new Pong(ball));
        Thread thread2 = new Thread(new Ping(ball));

        thread1.start();
        thread2.start();


    }
}
