package creational.factory;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = EmployeeFactory.getEmployees("web");
        System.out.println(emp1.salary());
        System.out.println(emp1.name());

        Employee emp2 = EmployeeFactory.getEmployees("android");
        System.out.println(emp2.salary());
        System.out.println(emp2.name());

    }
}
