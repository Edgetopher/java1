package homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(7,7));
        System.out.println(subtract(7,7));
        System.out.println(multiply(7,7));
        System.out.println(divide(7,7));
        System.out.println(exo(7,7));

    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
    public static double exo(double x, double y) {
        return Math.pow(x,y);
    }
}

