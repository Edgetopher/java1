package week4;

public class Triangle {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }
    public int getSide(){
        return side;
    }
    public int permOf() {
        return side + side + side;
    }
    public double areaOf() {
        return 0.5*(side * side);
    }
    public Triangle(int side){
        this.side =side;
    }
}
