package username;

public class homeWork2 {

    public static void reverse(String userInput) {
        String reverse = "";
        String str = userInput;
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
    public int age,salary;
    public String name,favSport,occ;

    public homeWork2(int age, int salary, String name, String favSport, String occ) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.favSport = favSport;
        this.occ = occ;
    }

    public homeWork2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + name +
                "and i am " + age +
                "year old. My favorite sports team is" + favSport  + '\n' +
                "and by this time next year my occupation will be" +  + '\n' +
                 occ + '\n' + "Meaning i could be making" + salary;
    }
}

