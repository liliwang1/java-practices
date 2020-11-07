package Testing;

public class Executive extends Person implements EmployeeActions {
    private String department;

    public Executive (String name, int age, String aDepartment) {
        super(name, age);
        this.department = aDepartment;
    }

    public String getDepartment(){
        return this.department;
    }

    public boolean badgedIn() {
        return true;
    }
    // note: all methods in an interface is public
// Omitting "public" here is an error by Java: Cannot reduce the visibility of the inherited method from EmployeeActions
// same thing applies to any methods inherited from superClass, cannot reduce visibility
    public void goToLunch() {
        System.out.println("eat lunch");
    }
}
