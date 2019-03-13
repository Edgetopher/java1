package newhw;

public class Fruit {
//    public void stringWithHyphen(String s1, String s2, String s3) {
//        System.out.println(s1 + "-" + s2 + "-" + s3);
//    }
    public void seperateArrayWHyphen(String[] array){
        String sep = "";

        for(String s : array) {
            System.out.print(sep + s);
            sep = "-";
        }
    }
}
