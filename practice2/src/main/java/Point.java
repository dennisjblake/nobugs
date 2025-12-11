public class Point {
    double x;
    double y;

    Point(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }

    double getX(){
        return this.x;
    }

    void setX(double newX){
        this.x = newX;
    }

    void print(){
        System.out.println("The x is " + this.x + " and y is " + this.y);
    }

}
