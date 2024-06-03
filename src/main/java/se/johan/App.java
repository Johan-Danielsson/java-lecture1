package se.johan;

import se.johan.menu.MethodsDemo;

public class App {

    public static void main(String[] args) {
        // person1
        Person person1 = new Person();
        person1.firstName = "Johan";
        person1.lastName = "Danielsson";
        person1.displayFullName(); // "Johan Danielsson"

        // person 2
        Person simon = new Person();
        simon.firstName = "Simon";
        simon.lastName = "Karlsson";
        simon.displayFullName();

        MethodsDemo.displayMenu(); // calls displayMenu from methodsDemo file

    }
}
