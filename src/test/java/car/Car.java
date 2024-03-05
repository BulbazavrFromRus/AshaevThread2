package car;

public class Car {
    private boolean waxOn = false;

    //мы вызываем метод waxed, ставим waxOn в true
    //и возбуждаем этот поток
    public synchronized void waxed(){
        waxOn = true;
        notifyAll();
    }

    //мы позбуждаем метод buffed,т.е покраски, когда waxOn в false
    //и методом notifyAll возбуждаем этот поток
    public synchronized void buffed(){
        waxOn  = false;
        notifyAll();
    }

    public synchronized void waitForWaxing() throws InterruptedException{
        //пока мы не наносим воск мы готоворим, а наносим краску,
        //мы говорим методу waitForWaxing подождать
        while(waxOn == false)
            wait();
    }

    public synchronized void waitForBuffing() throws InterruptedException{
        //полка мы наносим воск мы говорим методу waitForBuffering подождать
        while (waxOn == true)
            wait();
    }
}
