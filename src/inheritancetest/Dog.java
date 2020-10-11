package inheritancetest;

public class Dog extends Animal {
    String name;
    boolean isGood;

    public void bark() {
        System.out.println("ruff");
    }

    public void sayHi() {
        System.out.println("powwowwow");
    }
}
