package car;

import java.util.concurrent.TimeUnit;

public class WaxOff implements Runnable{
    private Car car;


    public WaxOff(Car car) {
        this.car = car;
    }


    @Override
    public void run() {

        try{
            while (!Thread.interrupted()){
                car.waitForWaxing();
                System.out.println("Wax off!");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
                car.waitForWaxing();
            }
        }catch (InterruptedException e){
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax off task");
    }
}
