package solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        // countFactorial();
        // printEvenNumbers();
        printCountdown();
    }

    public static void countFactorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= number){
            result = result * i;
            i++;
        }
        System.out.printf("The factorial is: %d%n", result);
    }

    public static void printEvenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number){
            if( i % 2 == 0){
                System.out.printf("The even number is: %d%n", i);
            }
            i++;
        }
    }

    public static void printCountdown(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number (1+): ");
        int number = scanner.nextInt();
        while (number >= 1){
            System.out.println(number);
            number --;
        }
    }


}
