package Lab;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private int numbOfExams;
    double s;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public int getNumberOfExamsTaken() {
        return numbOfExams;
    }

    public Student(String firstName, String lastName, ArrayList<Double> examScores, int numbOfExams) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
        this.numbOfExams = numbOfExams;
    }

//    public double getExamScores() {
//        for (s : examScores) {
//        }  return s;
//    }
//    public void setExamScores(double x){
//    }



}

