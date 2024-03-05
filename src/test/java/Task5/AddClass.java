package Task5;

public class AddClass implements Runnable {

    private ClassWithMethods classWithMethods;

    public AddClass(ClassWithMethods classWithMethods) {
        this.classWithMethods = classWithMethods;
    }

    @Override
    public void run() {
         classWithMethods.addElement();
    }
}
