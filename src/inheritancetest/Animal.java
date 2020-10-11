package inheritancetest;

public class Animal {
    protected String name = "none";
    public int age = 1;
    String diet = "good";

    protected void sayHi() {
        System.out.println("Hi");
    }

    protected void eat() {
        System.out.println("munch munch");
    }
}
