package week4;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }
    public int calculateArea(){
        return side * side;
    }
    public int getSide(){
         return side;
    }
    public void setSide(int side){
        this.side = side;
    }

}
