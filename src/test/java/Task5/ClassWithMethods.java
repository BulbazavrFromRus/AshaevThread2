package Task5;

import java.util.List;
import java.util.Random;

public class ClassWithMethods {

    private List<Integer> integerList;

    public ClassWithMethods(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public void addElement() {
        synchronized (integerList) {

            for (int i = 0; i < 10000; i++) {
                integerList.add(i);
            }

            if(integerList.size() == 10000){
                System.out.println("We add " + integerList.size());
            }

        }
    }

    public void removeElement() {
        synchronized(integerList){

            for(int i = 0 ; i < 10000; i++){
                Random r = new Random();
                int index = r.nextInt(integerList.size());
                integerList.remove(index);
            }

            if(integerList.isEmpty()){
                System.out.println("We removed all elements from list.");
            }

        }
    }
}
