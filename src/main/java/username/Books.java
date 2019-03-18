package username;

public class Books {
    String title;
    String author;

}
class booksTestDrive{
    public static void main(String[] args) {
        Books [] myBooks = new Books[3];
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].title = "Bob";
        myBooks[1].title = "Sue";
        myBooks[2].title = "Ian";

        while (x < 3) {
            System.out.println(myBooks[x].title);
            System.out.println(" by ");
            System.out.println(myBooks[x].author);
            x = x +1;
        }
    } // There is a psvm inside the main class as well as theres an extra class in the class
}
class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 4) {
            z=z +1;
            h[z] = new Hobbits();
            if(z ==1) {
                h[z].name = "frodo";
            }
            if(z == 2) {
                h[z].name ="sam";
            }
            System.out.println(h[z].name + "is a ");
            System.out.println("Good hobbit name");
        }

    }
}
class TestArrays {
    public static void main(String[] args) {
        String [] islands = new String [4];
    }
}