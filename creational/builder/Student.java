package creational.builder;

public class Student {

    private int id;
    private String name;
    private int age;

    public static Builder builder(){
        return new Student.Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder{

        private Student student = new Student();

        public Builder id(int id){
            student.id = id;
            return this;
        }

        public Builder name(String name){
            student.name = name;
            return this;
        }

        public Builder age(int age){
            student.age= age;
            return this;
        }

        public Student build(){
            return student;
        }
    }
}
