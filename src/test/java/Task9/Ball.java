package Task9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Ball {
    private boolean ping = false;
    private ReentrantLock locker = new ReentrantLock();
    private Condition condition = locker.newCondition();

    //when we exite, if we want to call ping, then we assign ping to true
    //and by using method notifyAll we exite ping
    public void ping(){
        locker.lock();

        try {
            ping = true;
            condition.signalAll();
        }finally {
            locker.unlock();
        }
    }


    //when ping is false we call method pong
    public void pong(){

        locker.lock();

        try {
            ping = false;
            condition.signalAll();
        }finally {
            locker.unlock();
        }
    }


    //while ping equals false it means that compiling pong (other method for pong)
    //and we ask ping for wait while other method do his work
    public void waitForPing()throws InterruptedException{
        locker.lock();

        try {
            while (ping == false)
                condition.await();
        }finally {
            locker.unlock();
        }
    }

    public void waitForPong()throws InterruptedException{

        locker.lock();

        try{
            while(ping==true)
                condition.await();
        }finally {
            locker.unlock();
        }
    }
}
