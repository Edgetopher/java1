package week4;

public class Employee {
    private int salary;
    private String nickname;
    private String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getNickname(){
        return nickname;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNickname(String nickname){
        this.nickname=nickname;
    }
    public Employee(){

    }

    public Employee(int salary,String name,String nickname){
        this.salary = salary;
        this.nickname = nickname;
        this.name = name;
    }
    public void raiseSalary(int amount){
        this.salary = salary + amount;
    }
    public String printName(){
        return "The employee's name is " + name;
    }
}
