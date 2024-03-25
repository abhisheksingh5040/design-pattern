package creational.builder;

public class Employee {

    private int id;
    private String name;
    private int age;

    public static Builder builder(){
        return new Employee.Builder();
    }

    public static class Builder{
        private Employee employee = new Employee();

        public Builder id(int id){
            employee.id = id;
            return this;
        }

        public Builder name(String name){
            employee.name = name;
            return this;
        }

        public Builder age(int age){
            employee.age = age;
            return this;
        }

        public Employee build(){
            return employee;
        }
    }
}
