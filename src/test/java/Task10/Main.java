package Task10;

public class Main {
    public static void main(String[] args) {
        CopyConcurrentHashMap<Integer,  String> copyConcurrentHashMap = new CopyConcurrentHashMap<>();


        Thread thread1 = new Thread(new PutClass2(copyConcurrentHashMap));
        Thread thread2 = new Thread(new PutClass1(copyConcurrentHashMap));
        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
