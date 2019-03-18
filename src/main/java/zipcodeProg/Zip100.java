package zipcodeProg;

public class Zip100 {
    public void num100(int x) {
        while(x >=1) {
            if (x % 5 == 0 && x % 3 == 0) {
                System.out.println("ZipCode");
            } else if (x % 5 == 0) {
                System.out.println("code");
            } else if (x % 3 == 0) {
                System.out.println("Zip");
            } else {
                System.out.println(x);
            }
            x--;
        }
    }
}
