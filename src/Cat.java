import inheritancetest.Animal;

public class Cat extends Animal {

    public void sayHi() {
        System.out.println("meow");
    }

    public void func() {
        System.out.println(this.name);
        System.out.println(this.age);
//        System.out.println(this.diet); // error, package-private
    }

    public void main() {
        System.out.println(this.name);
        System.out.println(this.age);
//        System.out.println(this.diet); // error, package-private
        System.out.println(super.age);
        System.out.println(super.name);
//        System.out.println(super.diet); // error, package-private
    }
}
