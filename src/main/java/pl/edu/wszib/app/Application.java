package pl.edu.wszib.app;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");

        MyClass myClass = new MyClass();
        myClass.field2 = "field2";
        myClass.field3 = "field3";
        myClass.field4 = "field4";
        myClass.run2();
        myClass.run3();
        myClass.run4();
    }
}
