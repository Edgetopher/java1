package rand;

public class Employee {
    public String job;
    public boolean working;
    public double earnings;

    public Employee(String job, boolean working, double earnings) {
        this.job = job;
        this.working = working;
        this.earnings = earnings;
    }

    public Employee(String job, int earnings) {
        this.job = job;
        this.earnings = earnings;
    }

    public void calculateEarnnings(){
        System.out.println("Im about to make " + earnings + " As a " + job);
    }
}
