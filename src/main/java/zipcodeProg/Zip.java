package zipcodeProg;

import java.util.Scanner;

public class Zip {
    Scanner scan = new Scanner(System.in);
     int x = scan.nextInt();

    public void numberSort(){
        if (x % 5 == 0 && x % 3 == 0) {
            System.out.println("ZipCode");
        } else if (x % 5 == 0) {
            System.out.println("code");
        } else if (x % 3 == 0) {
            System.out.println("Zip");
        } else {
            System.out.println("Error");
        }
    }
}
