package solvers;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // askForPositiveNumber();
        // checkPassword();
        // printNumbersFrom1To10();
        // waitForExitCommand();
        countDigitsInNumber();

    }
    static Scanner scanner = new Scanner(System.in);
    public static void askForPositiveNumber(){
        int number;
        do{
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        }while (number <= 0);
        System.out.printf("The positive number is: %d%n", number);
    }

    public static void checkPassword(){
        String enteredPassword = "";
        do {
            System.out.print("Enter a password: ");
            enteredPassword = scanner.next();
        } while (!enteredPassword.equals("pass"));
        System.out.println("The password is correct!");
    }

    public static void printNumbersFrom1To10(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void waitForExitCommand(){
        String command;
        do {
            System.out.print("Enter you command: ");
            command = scanner.next();
        }while (!command.equals("exit"));
        System.out.println("The exit command is entered");
    }

    public static void countDigitsInNumber(){
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;

        do {
            number = number / 10;
            count++;
        }while (number > 0);
        System.out.printf("The count is: %d%n", count);

    }


}
