public class MathOperations {

    static int arg1 = 400;
    static int arg2 = 2;

    public static void main(String[] args){
        int sum1 = add(arg1, arg2);
        System.out.println("The sum value is: " + sum1);
        int sub1 = subtract(arg1, arg2);
        System.out.println("The sub value is: " + sub1);
        int multp1 = multiply(arg1, arg2);
        System.out.println("The multp value is: " + multp1);
        double div1 = divide(arg1, arg2);
        System.out.println("The div value is: " + div1);
        System.out.println("The max value is: " + findMax(arg1, arg2));
        System.out.println("The difference is: " + difference(arg1, arg2));
        System.out.println("The square area is: " + squareArea(arg1) + " " + "and square perimeter is: " + squarePerimeter(arg1));
        System.out.println("The minutes are: " + convertSecondsToMinutes(arg1));
        System.out.println("The average speed is: " + averageSpeed(arg1, arg2));
        System.out.println("The average speed is: " + averageSpeed(10, 20));
        System.out.println("The hypotenuse is: " + findHypotenuse(2.2, 3.3));
        System.out.println("The hypotenuse is: " + findHypotenuse(4.4, 5.5));
        System.out.println("The circle circumference: " + circleCircumference(arg1));
        System.out.println("The circle circumference: " + circleCircumference(arg2));
        System.out.println("The percentage is: " + calculatePercentage(200, 25));
        System.out.println("The Celsius from F is: " + celsiusToFahrenheit(20));
        System.out.println("The Fahrenheit from C is: " + fahrenheitToCelsius(13));

    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double divide(int x, int y){
        return (double) x / y;
    }

    public static int findMax(int x, int y){
        return Math.max(x, y);
    }

    public static int difference(int x, int y){
        return Math.abs(x - y);
    }

    public static int squareArea(int side){
        return side * side;
    }

    public static int squarePerimeter(int side){
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time){
        return distance / time;
    }

    public static double findHypotenuse(double a, double b){
        return Math.sqrt((a * a) + (b * b));
    }

    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part){
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c){
        return c * ((double) 9 /5) + 32;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * ((double) 5/9);
    }


}