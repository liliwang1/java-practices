package Testing;

public class Employee extends Person implements EmployeeActions {
    private String department;

    public Employee(String name, int age, String aDepartment){
        super(name, age);
        this.department = aDepartment;
    }

    //getters
    public String getDepartment(){
        return this.department;
    }

    //setters
    public void setDepartment(String someDept){
        this.department = someDept;
    }

    public void goToLunch(){
        System.out.println("Gone to lunch.");
//        badgedIn();
    }

    public boolean badgedIn() {
        return false;
    }
}
