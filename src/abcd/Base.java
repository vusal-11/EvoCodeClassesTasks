package abcd;

public class Base {
    private String name;

    public Base(String name) {
        this.name = name;
    }

    public Base() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showName(){
        System.out.println("Base + "+this.name);
    }
}
