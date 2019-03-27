package week4;

public class Shape {
    private int x,y,z;
//    public Shape(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    public Shape(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public Shape(int x) {
//        this.x = x;
//    }


    @Override
    public String toString() {
        return "Length: " + x +
                ". Width: " + y +
                ". Side: " + z +
                '.';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    private String getArea(){
        return "The area is ";
    }

}
