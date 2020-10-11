import inheritancetest.Animal;

public class CatTest {
    public static void main(String[] args) {
        Cat fluff = new Cat();
        fluff.sayHi();
//        System.out.println(fluff.diet); // error, package-private
//        System.out.println(fluff.name); // error, protected
        System.out.println(fluff.age); // public
        fluff.main();

        Animal kitty = new Cat();
//        kitty.sayHi(); // error, overriding??
//        kitty.eat(); // error, protected
//        System.out.println(kitty.name); // error, protected
        System.out.println(kitty.age);
//        System.out.println(kitty.diet); // error, package-private
    }
}
