package se.johan;

public class VariablesDemo {

        //main method to print to the console, shortcut
        //shortcut is 'psvm + tab'
    public static void main(String[] args) {

        //shortcut for system out: 'sout + tab'
        System.out.println("Hello Java!");

        //Variables to store data
        // variables are byte, short, int, long, float, boolean, char

        // type variableName = number;
        byte temperature = 27;

        short age = 48;

        short employeeExperience = 3;

        int numberOfSeats = 500;

        // added 'L' to mark it as a long number, making it long(64bit)
        long balance = 5000000000000L;

        // declare decimal number - float(32bit) and double(64bit).

        // added 'f' to make it a float
        float radius = 5.5f;
        double area = 25.22;

        // declare single character
        char grade = 'A';
        // can also be written as Unicode
        char omega = '\u03A9';

        //boolean takes two values, true and false
        boolean isActive = false;
        boolean isLoggedIn = true;
        // declare it in one line
        int num1, num2, num3;

        System.out.println(omega);
        System.out.println("Temperature: " + temperature + "C");


    }
}
