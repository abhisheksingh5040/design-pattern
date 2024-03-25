package creational.factory;

public class EmployeeFactory {

    public static Employee getEmployees(String developer) {
        if ("ANDROID".equalsIgnoreCase(developer)) {
            return new AndroidDeveloper();
        } else if ("WEB".equalsIgnoreCase(developer)) {
            return new WebDeveloper();
        }
        return null;
    }
}
