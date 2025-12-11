public class Product {
    String name;
    double price;

    Product(String newName, double newPrice){
        this.name = newName;
        this.price = newPrice;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void applyDiscount(double discount){
        this.price = this.price - (this.price * (discount/100));
    }

    void printInfo(){
        System.out.println("The product is " + this.name + " and the price is $" + this.price);
    }

}
