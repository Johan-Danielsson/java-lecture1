package se.johan;

public class LoopsDemo {
    public static void main(String[] args) {
        // While Loop
        int count = 1;
        while (count <= 5) { // less than 5
            System.out.println("Iteriation: " + count); // 1 infinity loop
            count++; // increase the count to 2, starts over -> to 5
        }

        /*do{
            System.out.println("Iteration: " + count);
            count++;
        } while (count <= 5); */

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i); //1
        }
        System.out.println("Done");

        int number = 20;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "is an even number");
            } else {
                System.out.println(i + "is an odd number");
            }
        }

    }
}
