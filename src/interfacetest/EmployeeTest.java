package interfacetest;

public class EmployeeTest {
    public static void main(String[] args) {
        Developer amy = new Developer("amy");
        Employee lucy = new Developer("lucy");

        lucy.work();
        amy.work();
        System.out.println(lucy.name);
        System.out.println(lucy.getName());
    }
}
