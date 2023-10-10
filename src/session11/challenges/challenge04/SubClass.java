package session11.challenges.challenge04;

public class SubClass extends AbstractClass {

    public SubClass() {
        System.out.println("This is a normal class");
    }

    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }

    @Override
    public void another_method() {
        super.another_method();
    }
}
