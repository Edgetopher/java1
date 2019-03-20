public class test {



    public static String extractAllEvenNumbers(int[] numbers) {
        //Type your code here
        int i = 0;
        String s = "";
        while( i <numbers.length){
            for (int n: numbers){
                if( n % 2 ==0 ) {
                    s = s + n;
                }

            } i++;
        }
        return s;
    }


    // DO NOT TYPE BELOW HERE!!!
    public static void main(String[] args){
        int[]input = {2, 5, 6, 7, 23, 4, 8, 12, 9};
        extractAllEvenNumbers(input);
    }

}