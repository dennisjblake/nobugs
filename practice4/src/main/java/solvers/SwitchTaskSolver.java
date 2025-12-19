package solvers;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        // printDayOfTheWeek();
        // printTicketPriceByDay();
        // convertNumberPointIntoLetters();
        // textCommandsProcessing();
        simpleCalculator();
    }

    public static void printDayOfTheWeek(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number(1-7): ");
        int day = scanner.nextInt();
        String dayName = "";
        switch (day){
            case 1 -> dayName = "Monday";
            case 2 -> dayName = "Tuesday";
            case 3 -> dayName = "Wednesday";
            case 4 -> dayName = "Thursday";
            case 5 -> dayName = "Friday";
            case 6 -> dayName = "Saturday";
            case 7 -> dayName = "Sunday";
            default -> System.out.println("The wrong number!");
        }
        System.out.println(dayName);
    }

    public static void printTicketPriceByDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number (1-7): ");
        int dayNumber = scanner.nextInt();
        String ticketPrice = "";
        switch(dayNumber){
            case 1,2,3,4,5 -> ticketPrice = "$300";
            case 6,7 -> ticketPrice = "$450";
            default -> System.out.println("The wrong day number!");
        }
        System.out.println("The ticket price is: " + ticketPrice);
    }

    public static void convertNumberPointIntoLetters(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-100): ");
        int points = scanner.nextInt();
        String letterGrade = "";
        switch (points / 10){
            case 10,9 -> letterGrade = "A";
            case 8 -> letterGrade = "B";
            case 7 -> letterGrade = "C";
            case 6 -> letterGrade = "D";
            case 0,1,2,3,4,5 -> letterGrade = "F";
            default -> letterGrade = "Wrong Number";
        }
        System.out.println("The grade letter is: " + letterGrade);
    }

    public static void textCommandsProcessing(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the command: ");
        String command = scanner.nextLine();
        String message = "";
        switch (command){
            case "start" -> message = "System started";
            case "stop" -> message = "System stopped";
            case "restart" -> message = "System restarted";
            case "status" -> message = "System is ready";
            default -> message = "Incorrect command";
        }
        System.out.println(message);
    }

    public static void simpleCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter an operator (+,-,*,/): ");
        String operator = scanner.next();

        switch(operator){
            case "+":
                System.out.println("The adding result is: " + (number1 + number2));
                break;
            case "-":
                System.out.println("The substraction result is: " + (number1 - number2));
                break;
            case "*":
                System.out.println("The multiplying result is: " + (number1 * number2));
                break;
            case "/":
                if(number2 > 0) System.out.println("The dividing result is: " + ((double)number1 / (double)number2));
                else System.out.println("Can't divide by 0");
                break;
            default:
                System.out.println("The wrong operator");
        }
    }

}
