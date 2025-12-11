public class Rectangle {
    int width;
    int height;

    Rectangle(int newWidth, int newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }

    int getWidth(){
        return this.width;
    }
    int getHeight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width = newWidth;
    }

    void calculateArea(){
        System.out.println("The square is: " + this.width * this.height);
    }

}
