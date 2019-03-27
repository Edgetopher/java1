package Lab;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
//        ShoppingCart shop = new ShoppingCart();
//        System.out.println(shop.calcualteDiscount(2000,27.5));
//        int i=0;
//        do {
//            System.out.println(i);
//            i += 2;
//            while (i == 3) {
//                break;
//            }
//        }
//        String seaShells = "She sells seashells by the seashore.\n "  +
//                "The shells she sells are surely seashells. \n" +
//        "So if she sells shells on the seashore, \n" +
//        "Im sure she sells seashore shells";
//        int count =0;
//        String [] seaShellsSpaced = seaShells.split(" ");
//        for(int i =0; i < seaShellsSpaced.length; i++) {
//            if(seaShellsSpaced[i].equalsIgnoreCase("SELLS")) {
//                count++;
//                continue;
//            }
//        }
//        System.out.println("sells " + count);



//        int random = (int)(Math.random() * 6 + 1);
//        System.out.println(random);
//
//        switch(random) {
//            case 1:
//                System.out.println("Today is Sunday");
//                break;
//            case 2:
//                System.out.println("Today is Monday");
//                break;
//            case 3:
//                System.out.println("Today is Tuesday");
//                break;
//            case 4:
//                System.out.println("Today is Wednesday");
//                break;
//            case 5:
//                System.out.println("Today is Thursday");
//                break;
//            case 6:
//                System.out.println("Today is Friday");
//                break;
//            case 7:
//                System.out.println("Today is Saturday");
//                break;
//            default:
//                System.out.println("Its Caturday");
//                break;
//        }

//        String[] fruits= {"apple", "orange", "pizza"};
//        for(int i =0; i <fruits.length; i++) {
//            System.out.println(fruits[i]);
//
//        }
//
//        for(String s: fruits) {
//            System.out.println(s);
//        }
//     String [] asda= {"string","pizza","sadjkasdas"};
//     int [] sal = {1,2,3,4,5};
//     int [] las = {6,7,8,9,10};
//        for (String s: asda) {
//            System.out.println(s);
//
//
//        }
//        System.out.println(sal[1] * las[2]);
//
//
//
//
//        int [] [] magSq =
//                {
//                        {4,5,6},
//                        {1,2,3},
//                        {7,8,9}
//                };
//        System.out.println(magSq[0][0] * magSq[0][2]);

//        for (int row =0; row < magSq.length; row++) {
//            System.out.println("Row : " + row);
//            for(int column =0; column < magSq[row].length; column++) {
//                System.out.println("Column : " + column + " Row : " + row);
//
//            }
//        }
//

        double w = 192.21;
        double t = 0.79;
        double x = 23.5;
        int we = 789221;
        byte l = (byte) we;
        // so when casting a large number into a smaller primitive type it gives some overflow of course.
        // -127 to 128 is what a byte can store so the larger int will not be able to fully store
        int ww = (int) Math.round(w);
        int tt = (int) Math.round(t);
        // the Math.round method will round the number to the nearest whole number.
        // What do you think the Variable l will print out?
        System.out.println(ww);
        System.out.println(tt);
        System.out.println(Math.round(x * 3));
        System.out.println(l);











    }


}
