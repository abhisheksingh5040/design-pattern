package creational.abstractfactory;

import creational.factory.EmployeeFactory;

public class WebDeveloperEmployeeFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
