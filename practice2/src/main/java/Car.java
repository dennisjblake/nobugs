public class Car {
    int year;
    String brand;

    Car(int someYear, String someBrand){
        this.year = someYear;
        this.brand = someBrand;
    }

    int getYear(){
        return this.year;
    }
    String getBrand(){
        return this.brand;
    }

    void setYear(int someYear){
        this.year = someYear;
    }

    void setBrand(String someBrand){
        this.brand = someBrand;
    }

    void print(){
        System.out.println("The Brand is: " + this.brand + " and the year is: " + this.year);
    }


}

