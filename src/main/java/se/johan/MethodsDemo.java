package se.johan;

public class MethodsDemo {
    public static void main(String[] args) {
    displayMenu();

    int result = addition(5,2); //5+2=7
        System.out.println(result); //print out 7
    }

    public static void displayMenu(){
        System.out.println("1. Addition");
        System.out.println("2: Subtraction");
    }
    public static int addition(int number1, int number2){
        return number1 + number2;
    }
}
