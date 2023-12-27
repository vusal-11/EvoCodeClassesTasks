package abcd;

public class Child extends Base {

    public Child(String name) {
        super(name);
    }

    public Child() {
        super();
    }

    @Override
    public void showName() {
        System.out.println("Child + "+ super.getName());
    }
}
