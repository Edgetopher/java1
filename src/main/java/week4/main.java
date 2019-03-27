package week4;

public class main {
    public static void main(String[] args) {
//        Square square = new Square(2);
//        Triangle tri = new Triangle(2);
//        Circle circ = new Circle(2);
//        circ.setRadius(3);
//        tri.setSide(3);
//        square.setSide(3);
//        System.out.println(square.calculateArea());
//        System.out.println(tri.areaOf());
//        System.out.println(tri.permOf());
//        System.out.println(circ.getCirc());
//        System.out.println(circ.getArea());
//        CarLoan carLoan = new CarLoan();
//        carLoan.setAmountOfLoan(20000);
//        carLoan.setLoanInYears(6);
//        carLoan.setInterest(.0325);
//
//        MortgageLoan mortgageLoan = new MortgageLoan();
//        mortgageLoan.setAmountOfLoan(2000000);
//        mortgageLoan.setInterest(.015);
//        mortgageLoan.setLoanInYears(30);
//
//        HomeImprovementLoan homeImprovementLoan = new HomeImprovementLoan();
//        homeImprovementLoan.setAmountOfLoan(8000);
//        homeImprovementLoan.setInterest(.034);
//        homeImprovementLoan.setLoanInYears(3);
//        System.out.println("Home Improvement price :" + homeImprovementLoan.improvLoan());
//        System.out.println("Mortgage Loan Price: " + mortgageLoan.mortgageLoan());
//        System.out.println("Car loan Price: " + carLoan.carLoan());

       // Artist jesus = new Artist(23,"Kyle","To the Moon","Really Yeah!","Fruit Snacks");
        Employee jesus = new Employee(20000,"Jesus","Savior");
        jesus.raiseSalary(1500);
        System.out.println(jesus.getSalary());

        Manager jesus2 = new Manager("Scrum Master");
        System.out.println(jesus2.getManagerTitle());
        jesus2.raiseSalary(2500);
        jesus2.setNickname("lordy");
        jesus2.setName("pizza");
        System.out.println(jesus2.getNickname());
        System.out.println(jesus2.getName());

    }
}
