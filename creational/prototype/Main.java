package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Prototype  prototype = new Prototype();
        prototype.setIpAddress("27.0.0.1");
        prototype.generateImportantData();

        System.out.println(prototype);

        Prototype clone = null;
        try {
            clone = (Prototype) prototype.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(clone);

    }
}
