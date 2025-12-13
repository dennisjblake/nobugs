public class Main {

    public static void main(String[] args){
        Company.printCompanyName();
        Company employeeOne = new Company(1, "Steve Jobs");
        Company employeeTwo = new Company(2, "Tim Cook");
        Company.companyName = "Google";
        Company.printCompanyName();
        System.out.println(employeeOne.employeeID);

        MathConstants.calculateCircleArea(3);
        MathConstants.calculateCircumference(4);

        Library libraryOne = new Library();

        libraryOne.author = "Harry";
        libraryOne.year = 12;
        libraryOne.category = "Drama";
        libraryOne.setBookTitle("Test Title");

        System.out.println(libraryOne.author);
        System.out.println(libraryOne.year);
        System.out.println(libraryOne.category);
        System.out.println(libraryOne.getBookTitle());

        University studentOne = new University(1, "Alex");
        University studentTwo = new University(2, "Mike");
        University studentThree = new University(3, "Dod");

        University.changeUniversityName("KPI");

        studentOne.printStudentInfo();
        studentTwo.printStudentInfo();
        studentThree.printStudentInfo();

        GameSettings gameOne = new GameSettings("Dota 2");
        GameSettings gameTwo = new GameSettings("Fortnite");

        GameSettings.setMaxPlayers(3);
        gameOne.addPlayer();
        gameOne.addPlayer();
        gameOne.addPlayer();
        gameOne.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameOne.printGameStatus();
        gameTwo.printGameStatus();

        Person personOne = new Person("Mike", "Bloom", "111-22-3333");
        Person personTwo = new Person("Luke", "Skyworker", "000-00-0000");
        Person personThree = new Person("Lee", "Bruce", "123-45-6789");
        personOne.printPersonInfo();
        personTwo.printPersonInfo();
        personThree.printPersonInfo();
        personOne.setFirstName("Alex");
        personOne.printPersonInfo();
        personTwo.printPersonInfo();
        personThree.printPersonInfo();

    }

}
