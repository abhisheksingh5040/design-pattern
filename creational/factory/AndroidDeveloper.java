package creational.factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 900;
    }

    @Override
    public String name() {
        return "I am Android developer!!";
    }
}
