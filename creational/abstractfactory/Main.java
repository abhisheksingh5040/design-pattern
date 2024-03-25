package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee(new WebDeveloperEmployeeFactory());
        System.out.println(employee1.name());
        System.out.println(employee1.salary());

        Employee employee2 = EmployeeFactory.getEmployee(new AndroidDeveloperEmployeeFactory());
        System.out.println(employee2.name());
        System.out.println(employee2.salary());
    }
}
