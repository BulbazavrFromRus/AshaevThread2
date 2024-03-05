package Task7;

import java.util.concurrent.TimeUnit;

public class Ping implements Runnable{

    private Ball ball;

    public Ping(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Ping");
                TimeUnit.MILLISECONDS.sleep(2000);
                ball.ping();
                ball.waitForPong();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
