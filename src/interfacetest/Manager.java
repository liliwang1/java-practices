package interfacetest;

class Manager extends Employee {
    public Manager(String name) {
        super(name, "management");
    }

    public String work() {
        return "holding meetings";
    }
}