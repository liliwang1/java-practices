package Testing;

public class Person {
    private String name;
    private int age;

    //Constructors
    public Person(String aName, int anAge){
        this.name = aName;
        this.age = anAge;
    }

    //setters
    public void setName(String someName){
        this.name = someName;
    }

    public void setAge(int someAge){
        this.age = someAge;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
