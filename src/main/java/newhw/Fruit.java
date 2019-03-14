package newhw;

public class Fruit {
//    public void stringWithHyphen(String s1, String s2, String s3) {
//        System.out.println(s1 + "-" + s2 + "-" + s3);
//    }

    public void seperateArrayWHyphen(String[] fruits){
        String sep = "";
        for(int i=0;i<fruits.length; i++) {
            System.out.print(sep + fruits[i]);
            sep = "-";
        }
    }
}
