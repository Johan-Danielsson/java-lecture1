package se.johan;

public class OperatorsDemo {

    public static void main(String[] args) {
        // Assignment Operator
        int number1 = 10;
        int number2 = 5;
        System.out.println(number1); // 10
        System.out.println(number2); // 5
        number1 = number2; // change 1 to 2
        System.out.println(number1); // 5
        System.out.println(number2); // 5

        // Arithmetic Operators ( + - * / )
        int x = 10;
        int y = 5;
        // Store x + y in a new variable:
        int sum = x + y; // Addition
        int difference = x - y; // subtraction
        int multiplication = x * y; // multiplication
        int quotient = x / y; // Division 10 / 5 = 2
        int remainder = x % y; //modules or remainder
        //Now, lets print the results
        System.out.println("Addition " + sum);
        System.out.println("Subtraction " + difference);
        System.out.println("Multiplication " + multiplication);
        System.out.println("Quotient " + quotient);
        System.out.println("Remainder " + remainder);

        //Comparison Operators (==, !=, <, >, <=, >=)
        boolean isEqual = x == y;
        System.out.println(x == y);// false, they are not same
        System.out.println(x >= y); //true, x is greater than y
        System.out.println(x != y); //true

        // Increment and Decrement Operators
        int count = 5;
        //System.out.println(count++); // 5
        System.out.println(++count); // 6, will count 5, then add 1

    } // main method comment to know it's the end for main

} // class method end
