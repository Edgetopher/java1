package extra;

public class Beer {
    public static void main(String[] args) {
        int beerNum =99;
        String word ="Bottles";

        while (beerNum > 0) {

            if (beerNum ==1 ) {
                word = "bottle";
            }
            if (beerNum==99){
                System.out.println(beerNum+ " " + word + " of beer on the wall");
            }
            // The system.out of bottles of beer on the wall in the if statement already does this and makes it redundant
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum -1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + "of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
