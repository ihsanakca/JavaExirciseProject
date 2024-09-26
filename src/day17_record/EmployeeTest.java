package day17_record;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeClass employee = new EmployeeClass("Ali Ay", 5652);
        EmployeeClass employee1 = new EmployeeClass("Ali Ay", 5652);

        System.out.println(employee == employee1);

        System.out.println(employee.equals(employee1) );

        System.out.println("employee1.getName() = " + employee1.getName());

        System.out.println("employee1 = " + employee1.hashCode());
        System.out.println("employee = " + employee.hashCode());

        EmployeeRecord employee2 = new EmployeeRecord("Zeki Yavuz",2521);
        EmployeeRecord employee3 = new EmployeeRecord("Zeki Yavuz",521);
        System.out.println("employee2.name() = " + employee2.name());

        System.out.println("employee = " + employee);  // toString class
        System.out.println("employee2 = " + employee2); // record

        System.out.println("employee2.hashCode() = " + employee2.hashCode());
        System.out.println("employee3.hashCode() = " + employee3.hashCode());

        System.out.println("employee3.nameInUpperCase() = " + employee3.nameInUpperCase());

        EmployeeRecord.printManager();

        System.out.println("employee3.isWork() = " + employee3.isWork());

    }
}
