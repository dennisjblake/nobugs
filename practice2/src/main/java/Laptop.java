public class Laptop {
    String brand;
    double price;

    Laptop(String newBrand, double newPrice){
        this.brand = newBrand;
        this.price = newPrice;
    }

    String getBrand(){
        return this.brand;
    }

    double getPrice(){
        return this.price;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void printInfo(){
        System.out.println("The brand is " + this.brand + " and the price is $" + this.price);
    }
}
