package se.johan;

public class StringDemo {

    public static void main(String[] args) {
        String firstName = "Johan";
        String lastName = "Danielsson";
        String fullName = firstName + " " + lastName;
        //String fullName = firstName.concat( str: " ").concat(lastName); NOT WORKING
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());


    }
}
