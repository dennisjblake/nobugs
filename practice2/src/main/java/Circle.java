public class Circle {
    int radius;

    Circle(int newRadius){
        this.radius = newRadius;
    }

    int getRadius(){
        return this.radius;
    }

    void setRadius(int newRadius){
        this.radius = newRadius;
    }

    void calculateArea(){
        double area = Math.PI * this.radius * this.radius;
        System.out.println("The Area is " + area);
    }

    void calculateCircumference(){
        double circumference = 2 * Math.PI * this.radius;
        System.out.println("The circumference is " + circumference);
    }

}
