package Task10;

public class PutClass1 implements Runnable{
    private CopyConcurrentHashMap<Integer, String> copyConcurrentHashMap;

    public PutClass1(CopyConcurrentHashMap<Integer, String> copyConcurrentHashMap) {
        this.copyConcurrentHashMap = copyConcurrentHashMap;
    }


    @Override
    public void run() {
        for(int i = 0; i < 1000; ++i){
            copyConcurrentHashMap.put(i, "Operation1");
            System.out.println(copyConcurrentHashMap);
        }
    }
}
