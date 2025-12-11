public class Main {

    public static void main(String[] args){

        Car mainCar = new Car(2022, "Mazda");
        mainCar.print();
        mainCar.setYear(2023);
        mainCar.print();

        Rectangle newRect = new Rectangle(5, 10);
        newRect.calculateArea();
        newRect.setWidth(2);
        newRect.calculateArea();

        Book newBook = new Book("Harry Potter", "Joan Rowling");
        newBook.printInfo();
        newBook.setAuthor("Marko Polo");
        newBook.printInfo();

        BankAccount account = new BankAccount("McDonald", 1000);
        account.printBalance();
        account.deposit(100);
        account.printBalance();
        account.withdraw(50);
        account.printBalance();

        Point point1 = new Point(10, 20);
        point1.print();
        point1.setX(30);
        point1.print();

        StudentGroup group1 = new StudentGroup("Group High", 20);
        group1.printInfo();
        group1.setStudentCount(30);
        group1.printInfo();

        Circle circleOne = new Circle(10);
        circleOne.calculateArea();
        circleOne.calculateCircumference();
        circleOne.setRadius(5);
        circleOne.calculateArea();
        circleOne.calculateCircumference();

        Teacher teacherOne = new Teacher("Terri", "Math");
        teacherOne.printInfo();
        teacherOne.setSubject("Biology");
        teacherOne.printInfo();

        Product apple = new Product("iPhone 17", 2000);
        apple.printInfo();
        apple.setPrice(2100);
        apple.applyDiscount(10);
        apple.printInfo();

        Laptop laptopOne = new Laptop("MacBook", 2000);
        laptopOne.printInfo();
        laptopOne.setPrice(1000);
        laptopOne.printInfo();


    }

}
