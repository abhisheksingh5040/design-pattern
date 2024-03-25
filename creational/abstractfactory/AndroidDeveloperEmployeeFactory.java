package creational.abstractfactory;

public class AndroidDeveloperEmployeeFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
