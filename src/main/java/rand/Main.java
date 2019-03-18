package rand;

public class Main {
    public static void main(String[] args) {
//
//       Employee Mike = new Employee("Software Developer", 30000);
//       Employee Arod = new Employee("Burger Flipper",true,321);
//
//       Mike.calculateEarnnings();
//       Arod.calculateEarnnings();
//
//       char ch ='c';
//       String str = "Ch";
//       StringBuilder arod = new StringBuilder();
//       System.out.println(arod.append(ch).append(str));
//
//
char [] letterGrades= {'a','b','c','d','f'};
double rand =Math.random();
rand = rand *100;
        System.out.println(rand);
        if (rand >= 90) {
            System.out.println(letterGrades[0]);

        } else if(rand >= 80) {
            System.out.println(letterGrades[1]);
        } else if (rand >= 70) {
            System.out.println(letterGrades[2]);
        } else if (rand >= 60) {
            System.out.println(letterGrades[3]);
        } else if (rand < 60) {
            System.out.println(letterGrades[4]);
        }else {
            System.out.println("Error");
        }


    }
}
