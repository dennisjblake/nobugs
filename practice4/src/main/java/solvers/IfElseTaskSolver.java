package solvers;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // checkTheNumberType();
        // findTheBiggestNumberOfTwo();
        // showTheGrade();
        // checkParity();
        // checkDiscountValueByAge();
        checkTheResultByPoints();

    }

    public static void checkTheNumberType(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) System.out.println("The number is positive");
        else if(number < 0) System.out.println("The number is negative");
        else System.out.println("The number is equal zero");
    }

    public static void findTheBiggestNumberOfTwo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();
       // int theBiggestOne = (number1 > number2) ? number1 : number2;
        int theBiggestOne = Math.max(number1, number2);
        System.out.println("The biggest value is: " + theBiggestOne);
    }

    public static void showTheGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 -5): ");
        int number = scanner.nextInt();
        if(number == 5) System.out.println(Grade.BEST);
        else if(number == 4) System.out.println(Grade.GOOD);
        else if(number == 3) System.out.println(Grade.WELL);
        else if(number == 2 || number ==1) System.out.println(Grade.BAD);
    }

    public static void checkParity(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean result = number % 2 == 0;
        System.out.println("The numbers parity is: " + result);
    }

    public static void checkDiscountValueByAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an age: ");
        int age = scanner.nextInt();
        int discount = 0;
        if (age < 18) discount = 25;
        else if(age >= 65) discount = 30;
        System.out.println("The discount is: " + discount + "%");
    }

    public static void checkTheResultByPoints(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter points (0-100): ");
        int points = scanner.nextInt();
        String result = String.valueOf(Grade.BAD);
        if(points >= 90) result = String.valueOf(Grade.BEST);
        else if(points >= 75) result = String.valueOf(Grade.GOOD);
        else if (points >= 60) result = String.valueOf(Grade.WELL);
        System.out.println("The result is: " + result);
    }
}
