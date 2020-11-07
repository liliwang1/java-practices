package Testing;

public class Main {
    public static void main(String[] args) {

        // New Employee
        Employee jason = new Employee("Jason", 35, "Sith Training");
        displayWorker(jason);

        System.out.println();

        // New Executive
        Executive Li = new Executive("Li", 28, "Tardis Inspections");
        displayWorker(Li);

        // System.out.printf("The new executive is: %s\n", Li.getName());
        // System.out.printf("%s is %d years old\n", Li.getName(), Li.getAge());
        // System.out.printf("%s is a new executive assigned to %s\n", Li.getName(), Li.getDepartment());
        // System.out.printf("Is %s badged in? %b\n", Li.getName(), Li.badgedIn());
        // System.out.printf("It's now lunch time! %s is\n", Li.getName());
        // Li.goToLunch();
    }

    public static <T> void displayWorker(T emp) {
        String employeeType;
        if(emp instanceof Employee){
            employeeType = "employee";
        }else {
            employeeType = "executive";
        }

//        System.out.printf("The new %s is: %s\n", employeeType, emp.getName()); // .getClass()
//        System.out.printf("%s is %d years old\n", emp.getName(), emp.getAge());
//        System.out.printf("%s is a new %s assigned to %s\n", emp.getName(), employeeType, emp.getDepartment());
//        System.out.printf("Is %s badged in? %b\n", emp.getName(), emp.badgedIn());
//        System.out.printf("It's now lunch time! %s is\n", emp.getName());
//        emp.goToLunch();
    }
}
