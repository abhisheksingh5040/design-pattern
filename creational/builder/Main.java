package creational.builder;

public class Main {

    public static void main(String[] args) {
        Student student1 = Student
                .builder()
                .id(1)
                .name("Abhi")
                .build();

        Student student2 = Student
                .builder()
                .id(2)
                .name("Akash")
                .age(25)
                .build();

        System.out.println(student1);
        System.out.println(student2);
    }
}
