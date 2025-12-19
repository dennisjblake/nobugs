package solvers;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
        // printNumbersDividedBy3();
        // sumOfNumbers();
        // multiplicationTable();
        // checkNumberIsPrime();
        // checkNumberIsPrime();
        printNumber1to10();

    }

    public static void printNumbersDividedBy3(){
        for (int i = 1; i <= 100; i++ ){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum = sum + i;
        }
        System.out.printf("The sum is: %d%n", sum);
    }

    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-10): ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }

    public static void checkNumberIsPrime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number - 1; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.printf("The number is Prime: %s%n", isPrime);
    }

    public static void printNumber1to10(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

}
