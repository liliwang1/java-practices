package interfacetest;

class Developer extends Employee {
    public Developer(String name) {
        super(name, "development");
    }


    public String work() {
        System.out.println("writing code");
        return null;
    }
}

