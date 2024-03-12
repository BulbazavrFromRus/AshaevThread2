package Task9;

import java.util.concurrent.TimeUnit;

public class Pong implements Runnable{

    private Ball ball;

    public Pong(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                System.out.println("Pong");
                TimeUnit.MILLISECONDS.sleep(2000);
                ball.pong();
                ball.waitForPing();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
