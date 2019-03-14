package extra;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Godly", "Janky", "Smart", "Warrior", "Caring"};
        String[] wordListTwo = {"empowered", "Cooperative", "Anti-Social", "Negative", "Positive"};
        String[] wordListThree = {"Man", "Woman", "Bastard"};

        int oneLength =wordListOne.length;
        int twoLength =wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("We need a " + phrase);
    }
}
