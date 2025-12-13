public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String newFirstName, String newLastName, String newSsn){
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.ssn = newSsn;
    }

    String getFirstName(){
        return this.firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    String getSsn(){
        return this.ssn;
    }

    void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    void printPersonInfo(){
        System.out.println("Name: " + this.firstName + ", Last name: " + this.lastName + ", SSN: " + this.ssn);
    }

}
