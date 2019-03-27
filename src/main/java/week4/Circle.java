package week4;

public class Circle {
    int radius;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }
    public double getCirc(){
        return 2 * Math.PI * radius;
    }
}
