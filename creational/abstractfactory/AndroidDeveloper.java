package creational.abstractfactory;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 9000;
    }

    @Override
    public String name() {
        return "I am Android developer!!!";
    }
}
