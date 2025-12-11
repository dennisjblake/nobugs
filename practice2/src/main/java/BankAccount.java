public class BankAccount {
    String owner;
    int balance;

    BankAccount(String newOwner, int newBalance){
        this.owner = newOwner;
        this.balance = newBalance;
    }

    String getOwner(){
        return this.owner;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    void deposit(int amount){
        this.balance += amount;
    }

    void withdraw(int amount){
        this.balance -= amount;
    }

    void printBalance(){
        System.out.println("The Owner is: " + this.owner + " and the balance is: $" + this.balance);
    }


}
