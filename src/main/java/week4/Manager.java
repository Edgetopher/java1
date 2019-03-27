package week4;

public class Manager extends Employee {
    private String managerTitle;

    public String getManagerTitle(){
        return managerTitle;
    }
    public void setManagerTitle(String managerTitle){
        this.managerTitle = managerTitle;
    }
    public Manager(String managerTitle){
        this.managerTitle = managerTitle;
    }
}
