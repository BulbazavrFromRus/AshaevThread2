package Task5;

public class DeleteClass implements Runnable{
       private ClassWithMethods classWithMethods;

    public DeleteClass(ClassWithMethods classWithMethods) {
        this.classWithMethods = classWithMethods;
    }


    @Override
    public void run() {
          classWithMethods.removeElement();
    }
}
