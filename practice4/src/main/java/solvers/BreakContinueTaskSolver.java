package solvers;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
        // sumNumbersBeforeNegativeNumber();
        // skippNumberDividedBy3();
        // checkPositiveNumberInput();
        checkTheCommand();

    }

    public static void sumNumbersBeforeNegativeNumber(){
        int sum = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            if (number < 0) break;
            sum = sum + number;
        }
        System.out.printf("The sum is: %d%n",sum);
    }
    public static void skippNumberDividedBy3(){
        for (int i = 1; i <= 20; i++){
            if(i % 3 == 0){
             continue;
            }
            System.out.println(i);
        }
    }

    public static void checkPositiveNumberInput(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 0) continue;
            if (number == 0) break;
            System.out.printf("The positive number was entered: %d%n", number);
        }
    }

    public static void checkTheCommand(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter the command: ");
            String command = scanner.next();
            if(command.equals("stop")) break;
            System.out.printf("The command entered is: %s%n", command);
        }
        System.out.println("The EXIT command was entered!");
    }
}
