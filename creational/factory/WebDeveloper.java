package creational.factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 1000;
    }

    @Override
    public String name() {
        return "I am web developer!!!";
    }
}
