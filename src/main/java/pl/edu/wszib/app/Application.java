package pl.edu.wszib.app;

import pl.edu.wszib.app.mypackage.MyClass2;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");

        MyClass2 myClass = new MyClass2();
        myClass.field3 = "field3";
        myClass.field4 = "field4";
        myClass.run3();
        myClass.run4();
    }
}
