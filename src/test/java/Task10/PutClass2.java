package Task10;

public class PutClass2 implements Runnable{

    private CopyConcurrentHashMap<Integer, String> copyConcurrentHashMap;

    public PutClass2(CopyConcurrentHashMap<Integer, String> copyConcurrentHashMap) {
        this.copyConcurrentHashMap = copyConcurrentHashMap;
    }


    @Override
    public void run() {

        for(int i = 0; i < 1000; ++i){
            copyConcurrentHashMap.put(i, "Operation2");
            System.out.println(copyConcurrentHashMap);
        }
    }

}
