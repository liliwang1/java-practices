package inheritancetest;

public class Test {
    public static void main(String[] args) {
        Animal fido = new Dog(); // whatever is reset in the subclass will be shown(overriding), unique to the subclass won't work unless Type cast first, have no problem accessing properties/methods unique for superclass(except private ones)
//        fido.bark();
        fido.name = "fido";
        fido.sayHi();
        System.out.println(fido.name);
//        System.out.println(fido.isGood);
        System.out.println(fido.age);
        System.out.println(fido.diet); // visible, package-private
        fido.eat();

        Animal sheep = new Animal();
//        sheep.bark(); //error

        Dog bob = new Dog();
        System.out.println("bob " + bob.diet); // visible, package-private
    }

}
